package ru.roman;

public class Main {
    public static void main(String[] args) {
        int population=12_000_000;
        int birthRate=17*(population/1000);
        int mortality=8*(population/1000);
        int i;
        for (i=0;i<=10;i++){
            population=population+birthRate-mortality;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
    }
}