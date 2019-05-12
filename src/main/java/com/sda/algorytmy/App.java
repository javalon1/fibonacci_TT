package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {

   /*     int b=4;
        System.out.println(ciagFibonacciego(b));
        */
        long tab[] = new long[50];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
     /*   public static int ciagFibonacciego ( int a){
            if (a == 1) {
                return 0;
            } else if (a == 2) {
                return 1;
            } else {
                return ciagFibonacciego(a - 1) + ciagFibonacciego(a - 2);
            }*/

        }
    }

