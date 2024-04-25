import java.util.ArrayList;
import java.util.Scanner;

public class qus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(6);
        // list.add(sc.nextInt());
        
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }
}
