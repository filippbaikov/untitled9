
package com.company;

public class Main {

    public static void main(String[] args) {
        nomer1(33,9);
        nomer2(0);
        nomer3(7);
        nomer4("строка, которая передаётся", 5);
    }
    private static void nomer1 (int a, int b){

        int summa= a+b;
        if (summa>10 && summa<20)
            System.out.println(true);
        else
            System.out.println(false);
    }
    private static void nomer2(int x){
        if ( x % 2 ==0)
            System.out.println("положительное");
        else
            System.out.println("отридцательное");
    }
    private static void nomer3(int x){
        if ( x % 2 ==0)
            System.out.println(false);
        else
            System.out.println(true);
    }
    private static void nomer4(String word, int x){
        for (int y=0;y<x;y++){
            System.out.println(word);
        }
    }

}
