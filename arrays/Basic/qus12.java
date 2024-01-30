// Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.

// Example 1:

// Input :
// 5
// 2 4 3 5 6
// Output :
// 2 3 
// Explanation: 
// 2 and 3 are respectively the smallest 
// and second smallest elements in the array.

// Find the smallest and second smallest element in an array

public class qus12 {
    public long[] minAnd2ndMin(long a[], long n)  
    {
        
        long[] arr=new long[2];
      if(n<2) 
      {
          arr[0]=-1;
          arr[1]=-1;
      }
      else
      {
      Arrays.sort(a);
      arr[0]=a[0];
      int j=1;
      for(int i=1;i<n;i++)
      {
       if(arr[0]!=a[i])
       {
           arr[1]=a[i];
           break;
       }
       else
       j++;
      }
      if(j==n)
      {
           arr[0]=-1;
          arr[1]=-1;
      }
      }
      return arr;
    }
}
