// Reverse an array 


// Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes

// Example 1:

// Input: N = 7, K = 2
// arr[] = {1, 2, 3, 4, 5, 6, 7}
// Output: 3 4 5 6 7 1 2
// Explanation: Rotation of the above 
// array by 2 will make the output array


public class qus15 {
    void leftRotate(long arr[], int k,int n)
    {
        
          k=k%n;
        long a[]=new long[n];
        
       
        int j=0;
        for(int i=k;i<n;i++){
            a[j++]=arr[i];
            
        }
        
         for(int i=0;i<=k-1;i++){
            a[j++]=arr[i];
        }
        
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
    }
}
