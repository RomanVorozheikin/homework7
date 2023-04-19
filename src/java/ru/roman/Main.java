package ru.roman;

public class Main {
    public static void main(String[] args) {
        int salary=15_000;
        int total=salary;
        int month=1;
        do {
            if(month%6==0) {
                System.out.println("Месяц " + month + " сумма накоплений " + total);
            }
            month=month+1;
            total=total+salary;
            total=total+(total/100)*7;

        }while (total<=12_000_000);
    }
}