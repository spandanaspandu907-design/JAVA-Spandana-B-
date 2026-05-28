import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");

        String name = sc.nextLine();

        System.out.print("Enter Basic Salary:");

        double salary = sc.nextDouble();

        System.out.println("Employee Name:" + name);

        System.out.println("Total Salary: " + salary);


    }
    
}
