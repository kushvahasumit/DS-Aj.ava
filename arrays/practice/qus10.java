public class qus10 {
    public static int sum(){
        int arr[] = {2,3,4,5,6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }
}
