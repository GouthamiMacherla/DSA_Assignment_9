/*
 * <aside>
💡 **Question 4**

Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

**Example 1 :** 

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32

</aside>
 * 
 */

package in.ineuron.gouthami;

public class Exponent {
    public static int calculateExponent(int N, int P) {
        int result = 1;
        
        // Calculating exponent using a loop
        for (int i = 0; i < P; i++) {
            result *= N;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Testing the code
        int[][] testCases = {{5, 2}, {2, 5}};
        for (int[] testCase : testCases) {
            int N = testCase[0];
            int P = testCase[1];
            int exponent = calculateExponent(N, P);
            System.out.println(N + " raised to the power of " + P + ": " + exponent);
        }
    }
}
