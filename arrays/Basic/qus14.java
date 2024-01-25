// Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

// Example 1:

// Input:
// N = 7
// Arr[] = {1, 2, 3, 2, 3, 1, 3}
// Output: 3
// Explaination: 3 occurs three times.



public class qus14 {
    int getOddOccurrence(int[] arr, int n) {
       
        int[] a = new int[100000];
    for(int i =0;i<n;i++){
        a[arr[i]]++;
    }
    for(int i = 0;i<=100000;i++){
        if(a[i]%2!=0){
            return i;
        }
    }
    return -1;
  }
}
