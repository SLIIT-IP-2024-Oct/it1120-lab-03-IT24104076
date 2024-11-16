import java.util.Scanner;
public class IT24104076Lab3Q1A {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the price of 1kg  rice: ");
     double price= input.nextDouble();
     System.out.println("Enter the price of kilograms you want to buy:");
     double quantity=input.nextDouble();
     double total= price*quantity;
     System.out.println("the total amount is:"+total);
    }    
}