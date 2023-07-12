/*
 * <aside>
💡 **Question 7**

Given a string S, the task is to write a program to print all permutations of a given string.

**Example 1:**

***Input:***

*S = “ABC”*

***Output:***

*“ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”*

**Example 2:**

***Input:***

*S = “XY”*

***Output:***

*“XY”, “YX”*

</aside>
 * 
 */

package in.ineuron.gouthami;

import java.util.*;

public class StringPermutations {
    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(str.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutationsHelper(arr, index + 1, permutations);
            swap(arr, index, i); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"ABC", "XY"};
        for (String str : testCases) {
            List<String> permutations = generatePermutations(str);
            System.out.println("Permutations of " + str + ": " + permutations);
        }
    }
}



