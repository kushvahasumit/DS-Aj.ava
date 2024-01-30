// Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).If the key does not exist in the array then return -1 for both start and end index in this case.

// Example 1:

// Input:
// N = 6
// arr[] = { 1, 2, 3, 4, 5, 5 }
// Key = 5
// Output:  4 5
// Explanation:
// 5 appears first time at index 4 and
// appears last time at index 5.
// (0 based indexing)

public class qus3 {
    // Function to find starting and end index
    static int[] findIndex(int a[], int N, int key) {
        int[] result = { -1, -1 };



        for(int i = 0; i<N; i++){
            if(a[i] == key){
                result[0] = i;
                break;
            }
        }
        
        for(int i = N-1; i>=0; i--){
            if(a[i] == key){
                result[1] = i;
                break;
                
            }
        }

        
        // optimized
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                if (result[0] == -1) {
                    // First occurrence, set start index
                    result[0] = i;
                }
                // Update end index for every occurrence
                result[1] = i;
            }
        }
        return result;

    }
}
