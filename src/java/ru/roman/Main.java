package ru.roman;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        int past = year - 200;
        int future = year + 100;
        int i = 0;
        while (i < future) {
            i = i + 79;

            if (i > past&&i<future) {
                System.out.println(i);
            }
        }
    }
}