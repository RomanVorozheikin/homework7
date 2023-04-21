package ru.roman;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
            System.out.println("Месяц " + i + ", Сумма накоплений равна " + total);
        }
        //Задание 2
        int i =0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (i=10;i>0;i=i-1) {
            System.out.print(" " + i + " ");
        }
        //Задание 3
        int population=12_000_000;
        int birthRate=17*(population/1000);
        int mortality=8*(population/1000);
        int i;
        for (i=0;i<=10;i++){
            population=population+birthRate-mortality;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
        //Задание 4
        int salary=15_000;
        int total=salary;
        int month=1;
        do {
            System.out.println("Месяц "+month+" сумма накоплений "+total);
            month=month+1;
            total=total+salary;
            total=total+(total/100)*7;
        }while (total<=12_000_000);
        //Задание 5
        int total=salary;
        int month=1;
        do { if(month%6==0) {
            System.out.println("Месяц " + month + " сумма накоплений " + total);
        }
            month=month+1;
            total=total+salary;
            total=total+(total/100)*7;
        }while (total<=12_000_000);
        //Задание 6
        int salary = 15_000;
        int total = 0;
        int year = 9;
        int month = year * 12;
        int i=1;
        for (; i <= month; i++) { total = total + salary;
            total = total + (total / 100) * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопленная сумма " + total);
            }
        }
        //Задание 7
        int i=2;
        while (i<=31){
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            i=i+7;
        }
        //Задание 8
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