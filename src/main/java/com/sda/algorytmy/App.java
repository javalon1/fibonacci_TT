package com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        int b=4;

        System.out.println(ciagFibonacciego(b));

    }
    public static int ciagFibonacciego(int a){
        if (a==1){
            return 0;
        }
        else if (a==2){
            return 1;
        }
        else {
            return ciagFibonacciego(a-1)+ciagFibonacciego(a-2);
        }
    }
}
