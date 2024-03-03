// Given a sorted array having N elements, find the indices of the first and last occurrences of an element X in the given array.

// Note: If the number X is not found in the array, return '-1' as an array.

// Example 1:

// Input:
// N = 4 , X = 3
// arr[] = { 1, 3, 3, 4 }
// Output:
// 1 2
// Explanation:
// For the above array, first occurence
// of X = 3 is at index = 1 and last
// occurence is at index = 2.

import java.util.ArrayList;

public class qus4 {
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        // Initialize an ArrayList to store elements from the array 'arr'.
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(arr[i]);
        }

        // Initialize an ArrayList to store the first and last occurrences of 'x'.
        ArrayList<Integer> result = new ArrayList<>();

        // Check if 'x' is present in the ArrayList 'al'.
        if (al.contains(x)) {
            // If 'x' is found, add its first occurrence index to the result ArrayList.
            result.add(al.indexOf(x));
            // Add the last occurrence index of 'x' to the result ArrayList.
            result.add(al.lastIndexOf(x));
        } else {
            // If 'x' is not found, add -1 to the result ArrayList.
            result.add(-1);
        }

        // Return the result ArrayList containing the indices of 'x'.
        return result;

    }
}
