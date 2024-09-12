package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First();
        //System.out.println(Second("make install"));
        //System.out.println(Third(2, -11, 5));
        //System.out.println(Fourth());
        //Fifth("парам марап");
    }


    public static void First() {
        for (int number = 1; number <= 500; ++number) {
            String out = "";
            if (number % 5 == 0) {
                out += "fizz";
            }
            if (number % 7 ==0) {
                out += "buzz";
            }
            if (out.length() == 0) {
                out += number;
            }
            System.out.println(out);
        }
    }

    public static String Second(String phrase) {
        String out = "";
        for (int turn = phrase.length() - 1; turn >= 0; --turn) {
            out += phrase.charAt(turn);
        }
        return out;
    }

    public static String Third(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        String out;
        if (d < 0 ) {
            out = "нет вещественных корней";
        } else {
            if (d == 0) {
                double x = -b / (2 * a);
                out = String.valueOf(x);
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                out = String.valueOf(x1) + " " + String.valueOf(x2);
            }
        }
        return out;
    }

    public static double Fourth() {
        double out = 0.0;
        int turn = 2;
        double add = (double) 1 / (turn * turn + turn - 2);
        while(add > 0.000001) {
            out += add;
            ++turn;
            add = (double) 1 / (turn * turn + turn - 2);
        }
        return out;
    }
    public static String Fifth(String in) {
        String out;
        if (in.equals(Second(in))) {
            out = "строка является палиндромом";
        } else {
            out = "строка не является палиндромом";
        }
        return out;
    }
}