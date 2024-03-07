// Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

// Example 1:

// Input:
// str = 101
// Output:
// 1
// Explanation:
// Since string contains only 0 and 1, output is 1.

public class qus1 {
    boolean isBinary(String str)
	{
	  
	  // Iterate through each character in the string.
        for (char ch : str.toCharArray()) {
            // Check if the character is not '0' or '1'.
            if (ch != '0' && ch != '1') {
                // If any character is not '0' or '1', return false.
                return false;
            }
        }
        // If all characters are '0' or '1', return true.
        return true;
	}
}
