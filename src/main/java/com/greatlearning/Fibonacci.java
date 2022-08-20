package com.greatlearning;

public class Fibonacci {

    static void fib(int n)
    {
        int[] f = new int[n+2];
        f[0] = 0; f[1] = 1;
        System.out.print(0 + " " + 1 + " ");
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            System.out.print(f[i] + " ");
        }
        System.out.println();
    }
}
