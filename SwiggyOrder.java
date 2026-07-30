import java.util.Scanner;

public class SwiggyOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Food Item: ");
        String food = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Delivery Address: ");
        String address = sc.nextLine();

        System.out.println("Order Placed!");

    }
}
