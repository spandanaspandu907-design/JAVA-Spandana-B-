import java.util.Scanner;

public class HospitalEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Blood Group: ");
        String blood = sc.nextLine();

        System.out.print("Enter Weight: ");
        double weight = sc.nextDouble();

        System.out.println("Patient Registered!");

    }
}