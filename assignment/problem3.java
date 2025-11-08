import java.util.Scanner;

public class problem3 {
    static void printMyValue(int value) {
        if(value % 2 == 0){
            value = value - 1;
        }
        for (int i = 1; i <= value; i++) {
            System.out.print(2 * i - 1+ " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("type your value here");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        
        printMyValue(value);
        sc.close();
    }
}
