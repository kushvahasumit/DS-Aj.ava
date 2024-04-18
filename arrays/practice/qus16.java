public class qus16 {
    public static int secondSmall(int[] arr){
      int smallest = Integer.MAX_VALUE;
      int secondSmallest = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i]<smallest) {
            secondSmallest = smallest;
            smallest = arr[i];
        }else if (arr[i]<secondSmallest) {
            secondSmallest = arr[i];
        }
      }

      return secondSmallest;
    //   return smallest; also we can check smallest i.e 2

    }
    public static void main(String[] args) {
        int[] arr = {8,6,5,4,3,9,2,10};
        int result = secondSmall(arr);
        System.out.println(result);
    }
}
