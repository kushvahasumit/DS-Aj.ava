import java.util.ArrayList;
import java.util.Scanner;

public class qus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers:");

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int maxElement = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        System.out.println("Maximum element: " + maxElement);
    }
}
