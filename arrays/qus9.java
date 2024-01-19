// Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

 

// Example 1:

// Input:
// S = 00001
// Output:
// 4
// Explanation:
// Last index of  1 in given string is 4.


// Last index of 1


public class qus9 {
    public int lastIndex( String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
             char ch = s.charAt(i);
             if(ch == '1') return i;
         }
         return -1;  
     }
}
