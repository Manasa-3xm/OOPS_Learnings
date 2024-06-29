package org.example;

import java.util.Arrays;

public class ParallelStreams {
    //Parallel streams in Java provide a convenient way to perform operations concurrently on
    // collections or other data sources. They leverage multi-core processors to potentially speed up processing of large datasets

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sequence = Arrays.stream(numbers).map(x -> x * x).sum();
        System.out.println(sequence);
        int sumofparallel = Arrays.stream(numbers).parallel().map(x -> x * x).sum();
        System.out.println(sumofparallel);

    }


}