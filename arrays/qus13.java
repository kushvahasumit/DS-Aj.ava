// You are given an integer N. You need to convert all zeroes of N to 5.

// Example 1:

// Input:
// N = 1004
// Output: 1554
// Explanation: There are two zeroes in 1004
// on replacing all zeroes with "5", the new
// number will be "1554".


public class qus13 {
    int convertfive(int num) {
        String str = Integer.toString(num);

        str = str.replaceAll("0","5");

        int ans = Integer.valueOf(str);

        return ans;
    }
}
