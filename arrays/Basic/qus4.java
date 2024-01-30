// Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
 

// Example 1:

// Input:
// a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
// a2[] = {11, 3, 7, 1, 7}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]


public class qus4 {

    // solution
    string isSubset(int a1[], int a2[], int n, int m) {
        unordered_map<int, int> s;
      
      for(int i = 0; i < n; i++) {
          s[a1[i]]++;
      }
      
      for(int i = 0; i < m; i++) {
          if(s[a2[i]] <= 0) return "No";
          s[a2[i]]--;
      }
      
      return "Yes";
  }
    
}
