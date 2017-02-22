package com.wilsonfranca.hackerrank.fibonacci;

import java.util.Scanner;

/**
 * Created by wilson on 20/02/17.
 */
public class Solution {

    public static int fibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int result = fibonacci(n - 1) + fibonacci(n - 2);

        return result;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
