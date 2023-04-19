package ru.roman;

public class Main {
    public static void main(String[] args) {
        int i =0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (i=10;i>0;i=i-1){
            System.out.print(" " + i + " ");
        }
    }
}