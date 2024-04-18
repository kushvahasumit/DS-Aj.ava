public class qus14 {
    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 9 };
        double result = average(arr);
        System.out.println(result);
    }
}
