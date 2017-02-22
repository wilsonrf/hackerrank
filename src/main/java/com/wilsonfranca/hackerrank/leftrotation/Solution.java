package com.wilsonfranca.hackerrank.leftrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by wilson on 12/02/17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            int position = (a_i + (n - k )) % n;
            a[position] = in.nextInt();

        }
        for (int i: a) {
            System.out.print(i+ " ");
        }

    }

}
