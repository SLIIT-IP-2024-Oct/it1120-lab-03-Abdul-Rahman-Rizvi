import java.util.Scanner;
public class IT24102551Lab03Q1 {
   public static void main (String[]args) {
   Scanner input = new Scanner(System.in);
   double pricePerkg;
   double quantity;
   double totalAmount;
   System.out.print("Enter the price of 1 kg of rice:");
   pricePerkg = input.nextDouble();
   System.out.print("Enter the number of kilograms you want to buy:");
   quantity = input.nextDouble();
   totalAmount = pricePerkg*quantity;
   System.out.println("The total amount is: "+ totalAmount);
   
   }
}