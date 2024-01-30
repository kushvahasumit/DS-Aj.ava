// Given a binary array A[] of size N. The task is to arrange the array in increasing order.
// Note: The binary array contains only 0  and 1.
 

// Example 1:

// Input: 
// 5
// 1 0 1 1 0

// Output: 
// 0 0 1 1 1

// Explanation: 
// After arranging the elements in 
// increasing order, elements will be as 
// 0 0 1 1 1.


// Binary Array Sorting

public class qus6 {
    static void binSort(int A[], int N)
    {
         
        
          int count = 0;
        for(int i=0;i<N;i++){
            if(A[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            A[i]=0;
        }
        for(int i=count;i<N;i++){
            A[i]=1;
        }
         
    }
}
