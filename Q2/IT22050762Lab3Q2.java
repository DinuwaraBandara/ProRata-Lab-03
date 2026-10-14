import java.util.Scanner;

public class IT22050762Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter overtime hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter overtime hourly rate: ");
        double otRate = input.nextDouble();

        double otPayment = otHours * otRate;
        double totalSalary = salary + otPayment;

        System.out.println("Overtime Payment: Rs. " + otPayment);
        System.out.println("Total Monthly Salary: Rs. " + totalSalary);

        input.close();
    }
}
