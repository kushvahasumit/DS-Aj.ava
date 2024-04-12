public class qus11 {
    public static int dublicate(int arr[]){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[k] != arr[i]) {
                arr[k + 1] = arr[i];
                k++;
            }
        }
        return k + 1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,6,6};
        int result = dublicate(arr);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }
}
