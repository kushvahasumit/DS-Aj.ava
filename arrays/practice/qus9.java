public class qus9 {
    public static int add() {
        int arr[] = { 1, 2, 3, 4, 1, 2, 3, 1, 1, 2, 4, 5, 2, 1 };
        int k = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = add();
        System.out.println(result);
    }

}
