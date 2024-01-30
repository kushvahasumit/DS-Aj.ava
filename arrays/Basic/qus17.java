// Pitsy needs help with the given task by her teacher. The task is to divide an array into two sub-array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.

// Note: If the length of the array is odd then the right half will contain one element more than the left half.

// Example 1:

// Input : arr[ ] = {1, 2, 3, 4}
// Output : 21
// Explanation:
// Sum up an array from index 0 to 1 = 3
// Sum up an array from index 2 to 3 = 7
// Their multiplication is 21.


// multiply left and right array sum

public class qus17 {
    public static int multiply (int arr[], int n) {
      
        int sumL=0,sumR=0;
        for(int i=0; i<n/2; i++) {
            sumL+=arr[i];
        }
        for(int i=n/2; i<n; i++) {
            sumR+=arr[i];
        }
        int Product = sumL*sumR;
        return Product;
    }
}
