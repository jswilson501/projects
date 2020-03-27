import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int n1;
        int n2;
        char operator;
        double answer = 0;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Please type first number");
        n1 = scanObject.nextInt();
        System.out.println("Please type second number");
        n2 = scanObject.nextInt();
        System.out.println("What operation?");
        operator = scanObject.next().charAt(0);


        switch (operator) {
            case '+':
                answer = n1 + n2;
                break;
            case '-':
                answer = n1 - n2;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                answer = n1 / n2;
                break;
        }

        System.out.println(n1 + "" + operator + "" + n2 + "=" + answer);

        scanObject.close();
    }
}