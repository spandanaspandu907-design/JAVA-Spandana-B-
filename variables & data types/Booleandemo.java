import java.util.Scanner;

public class Booleandemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        boolean result = a > b;

        System.out.println("Is first number greater? " + result);

        sc.close();
    }
}