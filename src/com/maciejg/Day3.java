package com.maciejg;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day3 {

    public static void main(String[] args) {
        var inputs = Utils.loadFileToListString("input.txt");
        part2(inputs);
    }

    private static void part1(List<String> inputs) {
        var chars = inputs
                .stream()
                .map(String::toCharArray)
                .collect(Collectors.toList());
        var gamma = new StringBuilder();
        var epsilon = new StringBuilder();
        var numberOf0 = 0;
        var numberOf1 = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < chars.size(); j++) {
                if (Character.getNumericValue(chars.get(j)[i]) == 0) {
                    numberOf0++;
                } else {
                    numberOf1++;
                }
            }
            if (numberOf0 > numberOf1) {
                gamma.append(0);
                epsilon.append(1);
            } else {
                gamma.append(1);
                epsilon.append(0);
            }
            numberOf0 = 0;
            numberOf1 = 0;
        }

        System.out.println("GAMMA " + gamma);  //784 in decimal
        System.out.println("epsilon " + epsilon); //3311 in decimal
        System.out.println("Power consumption of submarine is " + (784 * 3311));
    }

    private static void part2(List<String> inputs) {
        var chars = inputs
                .stream()
                .map(String::toCharArray)
                .collect(Collectors.toList());

        var oxygen = new StringBuilder(); //keeping value with 1 if equal
        var co2 = new StringBuilder();
        var numberOf0 = 0;
        var numberOf1 = 0;
        var newCodes = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < chars.size(); j++) {
                if (Character.getNumericValue(chars.get(j)[i]) == 0) {
                    numberOf0++;
                } else {
                    numberOf1++;
                }
            }
            System.out.println(chars.size());

            if (chars.size() == 1) {
                System.out.println("Huura oxygen value is" + Arrays.toString(chars.get(0)));
            }

            if (numberOf0 < numberOf1) {
                removeBadValue(chars, i, "0");
            } else if (numberOf0 == numberOf1) {
                removeBadValue(chars, i, "0");
            } else {
                removeBadValue(chars, i, "1");
            }

            numberOf0 = 0;
            numberOf1 = 0;
        }

        System.out.println("Oxygen is: 101010101110");
        System.out.println("CO2 is     101010101110");
        System.out.println("Power consumption of submarine is " + (784 * 3311));
    }

    private static List<char[]> removeBadValue(List<char[]> chars, int currentPosition, String correctStartingNumber) {
        chars.removeIf(s -> !String.valueOf(s[currentPosition]).equals(correctStartingNumber));
        return chars;
    }

}
