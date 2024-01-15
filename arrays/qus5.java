// Given an array of size N. The task is to rotate array by D elements where D ≤ N.

// Example 1:

// Input:
// N = 7
// Arr[] = {1, 2, 3, 4, 5, 6, 7}
// D = 2
// Output: 3 4 5 6 7 1 2
// Explanation: 
// Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
// Rotate by 2: [3, 4, 5, 6, 7, 1, 2]

public class qus5 {
    void leftRotate(int[] arr, int n, int d) {
        // code here
         int[] temp = new int[d];
        d = d%n;
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
    }
}
