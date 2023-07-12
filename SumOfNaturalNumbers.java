/*
 * <aside>
💡 **Question 2**

Given a number n, find the sum of the first natural numbers.

**Example 1:**

Input: n = 3 

Output: 6

**Example 2:**

Input  : 5 

Output : 15

</aside>
 * 
 */

package in.ineuron.gouthami;

public class SumOfNaturalNumbers {
    public static int sumOfFirstNNumbers(int n) {
        // Formula to calculate the sum of first n natural numbers
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        // Testing the code
        int[] testCases = {3, 5};
        for (int n : testCases) {
            int sum = sumOfFirstNNumbers(n);
            System.out.println("Sum of the first " + n + " natural numbers: " + sum);
        }
    }
}
