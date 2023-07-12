/*
 * <aside>
💡 **Question 5**

Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45

</aside>
 * 
 */

package in.ineuron.gouthami;

public class MaximumElement {
    public static int findMaximum(int[] arr, int start, int end) {
        // Base case: if there is only one element
        if (start == end) {
            return arr[start];
        }
        
        // Calculate the mid index
        int mid = (start + end) / 2;
        
        // Recursive calls to find the maximum in the left and right subarrays
        int maxLeft = findMaximum(arr, start, mid);
        int maxRight = findMaximum(arr, mid + 1, end);
        
        // Compare the maximum values from the left and right subarrays
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        // Testing the code
        int[][] testCases = {{1, 4, 3, -5, -4, 8, 6}, {1, 4, 45, 6, 10, -8}};
        for (int[] arr : testCases) {
            int max = findMaximum(arr, 0, arr.length - 1);
            System.out.println("Maximum element in the array: " + max);
        }
    }
}

