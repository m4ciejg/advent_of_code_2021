package com.maciejg;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1 {
    public static void main(String[] args) {
        var inputs = Utils.loadFileToList("input.txt");
        part1(inputs);
    }

    private static void part1(List<Integer> inputs) {
        var numerOfIncreased = 0;
        for (int i = 0; i < inputs.size() - 1; i ++) {
            if (inputs.get(i + 1) > inputs.get(i)) {
                numerOfIncreased++;
            }
        }

        long count = IntStream.range(0, inputs.size() - 1)
                .filter(i -> inputs.get(i + 1) > inputs.get(i))
                .count();

        long count2 = IntStream.range(0, inputs.size() - 1)
                        .map(i -> inputs.get(i + 1) > inputs.get(i) ? 1 : 0)
                .sum();

        System.out.println(count2);
    }


    private static void part2(List<Integer> inputs) {
        var numerOfIncreased = 0;

        for (int i = 0; i < inputs.size() - 3; i ++) {
            int firstSum = calculateThreeMeasurementSum(inputs.get(i), inputs.get(i + 1), inputs.get(i + 2));
            int secondSum = calculateThreeMeasurementSum(inputs.get(i + 1), inputs.get(i + 2), inputs.get(i + 3));
            if (secondSum > firstSum) {
                numerOfIncreased++;
            }
        }

        System.out.println(numerOfIncreased);
    }

    private static int calculateThreeMeasurementSum(int input1, int input2, int input3) {
        return input1 + input2 + input3;
    }


}
