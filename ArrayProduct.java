/*
 * <aside>
💡 **Question 8**

Given an array, find a product of all array elements.

**Example 1:**

Input  : arr[] = {1, 2, 3, 4, 5}
Output : 120
**Example 2:**

Input  : arr[] = {1, 6, 3}
Output : 18

</aside>
 * 
 */

package in.ineuron.gouthami;

public class ArrayProduct {
    public static int findProduct(int[] arr) {
        int product = 1;
        
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        
        return product;
    }

    public static void main(String[] args) {
        // Testing the code
        int[][] testCases = {{1, 2, 3, 4, 5}, {1, 6, 3}};
        for (int[] arr : testCases) {
            int product = findProduct(arr);
            System.out.println("Product of array elements: " + product);
        }
    }
}

