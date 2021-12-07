package com.maciejg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day3 {

    public static void main(String[] args) {
        var inputs = Utils.loadFileToListString("input.txt");
        part1(inputs);
    }

    private static void part1(List<String> inputs) {
        var chars = inputs
                .stream()
                .map(String::toCharArray)
                .collect(Collectors.toList());
        var gamma = "";
        var epsilon = "";

//        for (var chr: chars) {
//            var numberOf0 = 0;
//            var numberOf1 = 0;
//            for (int i = 0; i < chr.length; i++) {
//                if (Character.getNumericValue(chr[i]) == 0 ) {
//                    numberOf0 ++;
//                } else {
//                    numberOf1 ++;
//                }
//            }
//        }

        List<List<String>> verticalList = new ArrayList<>();
        for (var chr: chars) {

        }
    }

}
