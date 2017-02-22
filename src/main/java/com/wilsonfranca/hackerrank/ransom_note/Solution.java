package com.wilsonfranca.hackerrank.ransom_note;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by wilson on 21/02/17.
 */
public class Solution {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new Hashtable<String, Integer>();
        String [] magazineValues = magazine.split(" ");
        Arrays.stream(magazineValues).forEach(s -> { magazineMap.put(s, 0);});
    }

    public boolean solve() {
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
