import java.util.Scanner;

public class Solution3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        System.out.print("Enter rate of interest: ");
        int rate = sc.nextInt();

        int simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple interest is: " + simpleInterest);
        System.out.println("Total payable amount is: " + (principal + simpleInterest));
    }
}
