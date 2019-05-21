package com.virtustream.restful.fibonacci;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(FibonacciController.class)
public class FibonacciControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FibonacciSequence fibonacciSequence;

    @Test
    public void testGetFibonacciSequenceOfMinus1() throws Exception {
        mvc.perform(get("/fibonacci/-1").contentType(MediaType.APPLICATION_JSON))
        .andDo(log())
        .andExpect(status().isBadRequest());
    }

    @Test
    public void testGetFibonacciSequenceOfSomeString() throws Exception {
        mvc.perform(get("/fibonacci/somestring").contentType(MediaType.APPLICATION_JSON))
        .andDo(log())
        .andExpect(status().isBadRequest());
    }

    @Test
    public void testGetFibonacciSequenceOf0() throws Exception {
        when(fibonacciSequence.generate(0)).thenReturn(Collections.emptyList());
        mvc.perform(get("/fibonacci/0").contentType(MediaType.APPLICATION_JSON))
        .andDo(log())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.*", hasSize(0)));
    }

    @Test
    public void testGetFibonacciSequenceOf2() throws Exception {
        when(fibonacciSequence.generate(2)).thenReturn(Arrays.asList(0, 1));
        mvc.perform(get("/fibonacci/2").contentType(MediaType.APPLICATION_JSON))
        .andDo(log())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.*", hasSize(2)))
        .andExpect(jsonPath("[0]", equalTo(0)))
        .andExpect(jsonPath("[1]", equalTo(1)));
    }

    @Test
    public void testGetFibonacciSequenceOf5() throws Exception {
        when(fibonacciSequence.generate(5)).thenReturn(Arrays.asList(0, 1, 1, 2, 3));
        mvc.perform(get("/fibonacci/5").contentType(MediaType.APPLICATION_JSON))
        .andDo(log())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.*", hasSize(5)))
        .andExpect(jsonPath("[0]", equalTo(0)))
        .andExpect(jsonPath("[1]", equalTo(1)))
        .andExpect(jsonPath("[2]", equalTo(1)))
        .andExpect(jsonPath("[3]", equalTo(2)))
        .andExpect(jsonPath("[4]", equalTo(3)));
    }

}
