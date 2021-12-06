package com.maciejg;

import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        var inputs = Utils.loadFileToList("input.txt");
        part2(inputs);
    }

    private static void part1(List<Integer> inputs) {
        var numerOfIncreased = 0;
        for (int i = 0; i < inputs.size() - 1; i ++) {
            if (inputs.get(i + 1) > inputs.get(i)) {
                numerOfIncreased++;
            }
        }

        System.out.println(numerOfIncreased);
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
