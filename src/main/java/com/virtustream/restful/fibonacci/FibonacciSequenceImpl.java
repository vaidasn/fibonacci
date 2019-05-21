package com.virtustream.restful.fibonacci;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class FibonacciSequenceImpl implements FibonacciSequence {

    public FibonacciSequenceImpl() {
    }

    @Override
    public List<Integer> generate(int series) {
        if (series < 0) {
            return Collections.emptyList();
        }
        return Stream.iterate(new int[] {0, 1}, s -> new int[] {s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }

}
