// Given a string, remove spaces from it. 

// Example 1:

// Input:
// S = "geeks  for geeks"
// Output: geeksforgeeks
// Explanation: All the spaces have been 
// removed.

public class qus5 {
    String modify(String S)
    {
       // Remove spaces from the string using the replaceAll() method.
        return S.replaceAll("\\s", "");
    }
}
