package com.maciejg;

import java.util.Optional;

public class Day4 {

    public static void main(String[] args) {

        try {
            test();
        } catch(Exception e) {
            e.printStackTrace();
        }
        test2();
    }

    static void test() {
        throw new ArrayIndexOutOfBoundsException("błąd");
    }

    static void test2() {
        System.out.println("NIe powinno mnie tu wpuścić");
    }
}
