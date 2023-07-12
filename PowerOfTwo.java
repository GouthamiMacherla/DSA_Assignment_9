/*
 * <aside>
💡 **Question 1**

Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

**Example 1:**
Input: n = 1 

Output: true

**Example 2:**
Input: n = 16 

Output: true

**Example 3:**
Input: n = 3 

Output: false

</aside>
 * 
 */
package in.ineuron.gouthami;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Testing the code
        int[] testCases = {1, 16, 3};
        for (int n : testCases) {
            System.out.println(n + " is a power of two: " + isPowerOfTwo(n));
        }
    }
}
