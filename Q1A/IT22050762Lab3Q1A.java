import java.util.Scanner;

public class IT22050762Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;

        System.out.println("Total price: Rs. " + total);

        input.close();
    }
}
