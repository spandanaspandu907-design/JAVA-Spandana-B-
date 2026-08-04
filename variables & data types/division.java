import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int intDivision = a / b;
        float floatDivision = (float) a / b;

        System.out.println("Integer Division = " + intDivision);
        System.out.println("Float Division = " + floatDivision);

        sc.close();
    }
}