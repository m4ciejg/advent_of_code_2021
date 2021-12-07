package com.maciejg;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 {

    public static void main(String[] args) {
        var inputs = Utils.loadFileToListString("input.txt");
        part2(inputs);
    }

    private static void part1(List<String> inputs) {
        var forward = inputs.stream()
                .filter(s -> s.contains("forward"))
                .mapToInt(Day2::findInteger)
                .sum();

        var down = inputs.stream()
                .filter(s -> s.contains("down"))
                .mapToInt(Day2::findInteger)
                .sum();

        var up = inputs.stream()
                .filter(s -> s.contains("up"))
                .mapToInt(Day2::findInteger)
                .sum();
        var depth = down - up;
        System.out.println(forward * depth);

    }

    private static void part2(List<String> inputs) {
        var aim = 0;
        var depth = 0;
        var forward = 0;

        for (var input: inputs) {
            if (input.contains("down")) {
                aim += findInteger(input);
            }

            if (input.contains("up")) {
                aim -= findInteger(input);
            }

            if (input.contains("forward")){
                forward += findInteger(input);
                depth += aim * findInteger(input);
            }
        }

//        var forward = inputs.stream()
//                .filter(s -> s.contains("forward"))
//                .mapToInt(Day2::findInteger)
//                .sum();
//
//        var down = inputs.stream()
//                .filter(s -> s.contains("down"))
//                .mapToInt(Day2::findInteger)
//                .sum();
//
//        var up = inputs.stream()
//                .filter(s -> s.contains("up"))
//                .mapToInt(Day2::findInteger)
//                .sum();
//        var aim = down - up;

        System.out.println(forward * depth);

    }

    private static int findInteger(String input) {
        Pattern integerPattern = Pattern.compile("-?\\d+");
        Matcher matcher = integerPattern.matcher(input);
        return matcher.find() ? Integer.parseInt(matcher.group()) : 0;
    }


}
