// Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.

// Example 1:

// Input : A[] = {5, 7, 9, 3, 6, 2}, 
//         B[] = {1, 2, 6, -1, 0, 9}
// Output : -9
// Explanation:
// The first array is 5 7 9 3 6 2. 
// The max element among these elements is 9.
// The second array is 1 2 6 -1 0 9.
// The min element among these elements is -1.
// The product of 9 and -1 is 9*-1=-9.



public class qus2 {
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        
        for(int i:arr){
            if(i>max){
                max = i;
            }    
        }
        
        for(int i:brr){
            if(i<min){
                min = i;
            }
        }
        
        return max*min;
    }
}
