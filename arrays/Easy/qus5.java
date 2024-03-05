
// Given an array of size n which contains all elements occurring in multiples of K, except one element which doesn't occur in multiple of K. Find that unique element.
 

// Example 1:

// Input : 
// n = 7, k = 3
// arr[] = {6, 2, 5, 2, 2, 6, 6}
// Output : 
// 5
// Explanation:
// Every element appears 3 times except 5.

import java.util.Arrays;
import java.util.HashSet;

public class qus5 {
     public int findUnique(int a[], int n, int k)
    {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(a);
        int ans = 0;

        for (int x : a) {
            if (hs.contains(x)) {
                continue;
            } else {
                hs.add(x);
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == x) {
                        count++;
                    }
                }
                if (count % k != 0) {
                    ans = x;
                    break;
                }
            }
        }

        return ans;
    }
}
