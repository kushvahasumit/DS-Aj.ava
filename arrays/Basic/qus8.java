// Given an array A[] of N elements. The task is to count number of even and odd elements in the array.

// Example:

// Input:
// N = 5
// A[] = 1 2 3 4 5
// Output:
// 3 2
// Explanation:
// There are 3 odd elements (1, 3, 5)
// and 2 even elements (2 and 4).


// Count odd or even


public class qus8 {
    public void countOddEven(int[] arr, int n)
    {
        int odd=0;
        int even=0;
        for(int i=0; i<n; i++) if(arr[i]%2==0) even++;
        System.out.println((n-even)+" "+even);
    }
}
