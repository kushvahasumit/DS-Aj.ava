class qus10 {
    
    public static int missingNumber(int A[], int N)
    {
          int total_sum = N * (N +1)/2;
         int sum =0;
         for(int i=0;i<A.length ;i++) {
             sum = sum+A[i];
         }
         
         return (total_sum - sum);
    }
}