import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first variable");
        int v1 = scan.nextInt();
        System.out.println("Enter the second variable");
        int v2 = scan.nextInt();
        System.out.println("Before swap: v1 = " + v1 + "; " + "v2 = " + v2);
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;
        System.out.println("After swap: v1 = " + v1 + "; " + "v2 = " + v2);
    }
}
