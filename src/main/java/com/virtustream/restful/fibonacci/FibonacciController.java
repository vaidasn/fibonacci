package com.virtustream.restful.fibonacci;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    private static final Logger logger = LoggerFactory.getLogger(FibonacciController.class);

    private final FibonacciSequence fibonacciSequence;

    public FibonacciController(@Autowired FibonacciSequence fibonacciSequence) {
        this.fibonacciSequence = fibonacciSequence;
    }

    @GetMapping("/fibonacci/{number}")
    public List<BigInteger> getFibonacciSequence(@PathVariable int number) {
        logger.debug("getFibonacciSequence of " + number);
        if (number < 0) {
            throw new FibonacciException();
        }
        return fibonacciSequence.generate(number);
    }

}
