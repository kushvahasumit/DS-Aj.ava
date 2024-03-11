// Given a String S , print the reverse of the string as output.

// Example 1:

// Input: S = "GeeksforGeeks"
// Output: "skeeGrofskeeG" 
// Explanation: Element at first is at last and
// last is at first, second is at second last and 
// second last is at second position and so on .

public class qus {

    static String revStr(String S) {
        // Initialize an empty string to store the reversed string.
       String reversed = "";

       // Iterate through the characters of the input string in reverse order.
       for (int i = S.length() - 1; i >= 0; i--) {
           // Append each character to the reversed string.
           reversed += S.charAt(i);
       }

       // Return the reversed string.
       return reversed;
   }
}