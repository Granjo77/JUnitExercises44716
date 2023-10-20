package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static boolean isPrime(int num){
        int divisors = 0;
        for (int i = 1; i >= num ; i++){
            if ((num % i) == 0){
                divisors++;
            }
        }
        if (divisors > 3){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isEven(int num){
        if ((num % 2) == 0){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isMultiple(int number, int divisor){
        if ((number % divisor) == 0){
            return true;
        } else{
            return false;
        }
    }
}