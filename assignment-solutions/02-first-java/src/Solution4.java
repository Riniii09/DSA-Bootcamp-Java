import java.util.*;

public class Solution4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int answer=0;
        if (operator == '+') {
            answer = number1 + number2;
        } else if(operator == '-') {
            answer = number1 - number2;
        } else if (operator == '*') {
            answer = number1 * number2;
        } else if (operator == '/') {
            answer = number1 / number2;
        }
        System.out.println("The answer is: " + answer);
    }
}
