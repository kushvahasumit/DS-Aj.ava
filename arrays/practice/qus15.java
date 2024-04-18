public class qus15 {
    static class countResult {
        int countOdd = 0;
        int countEven = 0;
        
    }
    public static countResult count(int[] arr){
        countResult result = new countResult();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                result.countEven++;
            } else {
                result.countOdd++;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        countResult fullResult = count(arr);
        System.out.println("Number of even : "+fullResult.countEven);
        System.out.println("Number of odd : " +fullResult.countOdd);
    }
}
