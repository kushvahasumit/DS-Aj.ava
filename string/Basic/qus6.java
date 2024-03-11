// Given a string str, convert the first letter of each word in the string to uppercase. 

// Example 1:

// Input:
// str = "i love programming"
// Output: "I Love Programming"
// Explanation:
// 'I', 'L', 'P' are the first letters of 
// the three words.


public class qus6 {
    public String transform(String s)
    {
             // Split the string into words using whitespace as the delimiter.
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        // Loop through each word in the array.
        for (String word : words) {
            // Capitalize the first letter of each word and append it to the result.
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" "); // Add a space after each word.
        }

        // Convert the StringBuilder to a string and trim any extra whitespace.
        return result.toString().trim();
        
    }
}
