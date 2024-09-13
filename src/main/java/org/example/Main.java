package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        for (int number = 1; number <= 500; ++number){
//            System.out.println(first(number));
//        }
        //System.out.println(second("make install"));
        System.out.println(third(2, -11, 5));
        //System.out.println(fourth());
        //fifth("парам марап");
    }


    public static String first(int number) {
        String out = "";
        if (number % 5 == 0) {
            out += "fizz";
        }
        if (number % 7 == 0) {
            out += "buzz";
        }
        if (out.isEmpty()) {
            out += number;
        }
        return out;
    }

    public static String second(String phrase) {
        String out = "";
        for (int turn = phrase.length() - 1; turn >= 0; --turn) {
            out += phrase.charAt(turn);
        }
        return out;
    }

    public static Pair third(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        Pair out = new Pair(0.0, 0.0);
        if (d >= 0) {
            if (d == 0) {
                out.x1 = -b / (2 * a);
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                out.x1 = x1;
                out.x2 = x2;
            }
        }
        return out;
    }

    public static double fourth() {
        double out = 0.0;
        int turn = 2;
        double add = 1.0 / (turn * turn + turn - 2);
        while (add > 0.000001) {
            out += add;
            ++turn;
            add = (double) 1 / (turn * turn + turn - 2);
        }
        return out;
    }

    public static String fifth(String in) {
        String out;
        if (in.equals(second(in))) {
            out = "строка является палиндромом";
        } else {
            out = "строка не является палиндромом";
        }
        return out;
    }
}

