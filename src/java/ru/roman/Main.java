package ru.roman;

public class Main {
    public static void main(String[] args) {
        int salary = 15_000;
        int total = 0;
        int year = 9;
        int month = year * 12;
        int i=1;
        for (; i <= month; i++) {

            total = total + salary;
            total = total + (total / 100) * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопленная сумма " + total);
            }
        }
    }
}