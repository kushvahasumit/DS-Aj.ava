public class qus7 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.println("this is even "+arr[i]);
            } else {
                System.out.println("this is odd "+arr[i]);
            }
        }
    }
}
