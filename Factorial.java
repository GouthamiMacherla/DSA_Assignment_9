/*
 * <aside>
💡 **Question 3**

****Given a positive integer, N. Find the factorial of N. 

**Example 1:**

Input: N = 5 

Output: 120

**Example 2:**

Input: N = 4

Output: 24

</aside>
 * 
 */

package in.ineuron.gouthami;

public class Factorial {
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        int fact = 1;
        // Calculating factorial using a loop
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }

    public static void main(String[] args) {
        // Testing the code
        int[] testCases = {5, 4};
        for (int n : testCases) {
            int fact = factorial(n);
            System.out.println("Factorial of " + n + ": " + fact);
        }
    }
}

