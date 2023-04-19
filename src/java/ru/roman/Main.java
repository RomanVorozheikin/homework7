package ru.roman;

public class Main {
    public static void main(String[] args) {
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
            System.out.println("Месяц " + i + ", Сумма накоплений равна " + total);
        }
    }
}