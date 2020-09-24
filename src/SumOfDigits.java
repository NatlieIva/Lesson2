import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two-digit number:");
        int num = scan.nextInt();
        if ((num < 100) & (num > -100)) {
            int sum = num/10 + num % 10;
            System.out.println("Sum of digit: " + sum);
        } else {
            System.out.println("the number is not two-digit");
        }
    }
}
