import java.util.Scanner;
public class IT24104076Lab3Q3{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the amount:");
    int amount= input.nextInt();
    System.out.println("5000 Notes:"+ amount/5000);
    int Remainder=amount%5000;
    System.out.println("1000 Notes:"+ Remainder/1000);
    int Remainder1=Remainder%1000;
    System.out.println("500 Notes:"+ Remainder1/500);
    int Remainder2=Remainder1%500;
    System.out.println("200 Notes:"+ Remainder2/200);
    int Remainder3=Remainder2%200;
    System.out.println("100 Notes:"+ Remainder3/100);
    int Remainder4=Remainder3%100;
    System.out.println("50 Notes:"+ Remainder4/50);
    int Remainder5=Remainder4%50;
    System.out.println("20 Notes:"+ Remainder5/20);
    int Remainder6=Remainder5%20;
    System.out.println("10 Coins:"+ Remainder6/10);
    int Remainder7=Remainder6%10;
    System.out.println("05 Coins:"+ Remainder7/05);
    int Remainder8=Remainder7%05;
    System.out.println("02 Coins:"+ Remainder8/02);
    int Remainder9=Remainder8%02;
    System.out.println("01 Coins:"+ Remainder9/01);
    }
}