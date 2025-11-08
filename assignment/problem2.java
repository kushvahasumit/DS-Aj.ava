import java.util.Scanner;

public class problem2 {
    static void printMyValue(int value){
        for (int i = 1; i <= value; i++) {
            System.out.print(2*i-1+ " ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        printMyValue(value);
        sc.close();
    }
}
