package com.greatlearning;

import java.util.Scanner;

public class Main {

    //function to checkPalindrome
    public void checkPalindrome(int num) {
        System.out.println("Palindrome Number : " + Palindrome.isPalindrome(num));
    }

    //function to printPattern
    public void printPattern(int num) {
        Pattern.print(num);
    }

    //function to check no is prime or not
    public void checkPrimeNumber(int num) {
        System.out.println("prime number : " + PrimeNumber.isPrime(num));
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries(int num) {
        Fibonacci.fib(num);
    }


//main method which contains switch and do while loop

    public static void main(String[] args) {
        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            int num = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {

                    obj.checkPalindrome(num);
                }
                break;
                case 2: {
                    obj.printPattern(num);
                }
                break;
                case 3: {
                    obj.checkPrimeNumber(num);
                }
                break;
                case 4: {
                    obj.printFibonacciSeries(num);
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}