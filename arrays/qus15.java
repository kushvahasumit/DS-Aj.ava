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
