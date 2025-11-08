import java.util.Scanner;

public class program1 {
    public static double calculate(double a,double b ,String operation){
        double answer = 0;

        switch(operation){
            case "add":
                answer = a+b;
                break;
            case "sub":
                answer = a- b;
                break;
            case "mul":
                answer = a*b;
                break;
            case "div":
                answer = a / b;
                break;
            default:
                System.out.println("invalid data");
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("please write 2 value and one operation(add,sub,mul,div)");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String operation = sc.next();

        double result = calculate(a,b,operation);
        System.out.println(result);

        sc.close();
    }
}
