package Easy;

// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4

// Missing number in an array


public class qus1 {
    int missingNumber(int array[], int n) {
        int sumArray =0;
        for(int i=0 ; i < array.length;i++){
            sumArray+=array[i];
        }
        int totalSum = n*(n+1) / 2;
        return totalSum - sumArray;
     }
}
