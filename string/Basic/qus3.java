// Given a list of names, display the longest name. If there are multiple names of the longest size then return the first occurring name .

// Example1 :

// Input:
// n = 5
// names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" }
// Output: GeeksforGeeks
// Explanation: name "GeeksforGeeks" has maximum length among all names. 


public class qus3 {
    public static String longest(int n, String[] names) {
      
        String longName = "";
        for (int i = 0; i < n; i++) {
            if (names[i].length() > longName.length()) {
                longName = names[i];
            }
        }
        return longName;
      }
}
