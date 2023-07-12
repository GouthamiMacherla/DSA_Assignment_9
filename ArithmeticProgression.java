/*
 * <aside>
💡 **Question 6**

Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nth term of the series.

**Example 1:**

Input : a = 2 d = 1 N = 5
Output : 6
The 5th term of the series is : 6

**Example 2:**

Input : a = 5 d = 2 N = 10
Output : 23
The 10th term of the series is : 23

</aside>
 * 
 */

package in.ineuron.gouthami;

public class ArithmeticProgression {
    public static int findNthTerm(int a, int d, int N) {
        // Calculate the Nth term of the Arithmetic Progression
        int nthTerm = a + (N - 1) * d;
        return nthTerm;
    }

    public static void main(String[] args) {
        // Testing the code
        int[][] testCases = {{2, 1, 5}, {5, 2, 10}};
        for (int[] testCase : testCases) {
            int a = testCase[0];
            int d = testCase[1];
            int N = testCase[2];
            int nthTerm = findNthTerm(a, d, N);
            System.out.println("The " + N + "th term of the series is: " + nthTerm);
        }
    }
}
