import java.util.Scanner;
public class IT24104076Lab3Q2{
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("Enter the monthly salary:");
double salary= input.nextDouble();
System.out.println("Enter the number of OT hours:");
double hours=input.nextDouble();
System.out.println("Enter the OT hourly rate:");
double rate=input.nextDouble();
double total= hours*rate;
salary= salary+total;
System.out.println(" The Total salary including OT is:"+salary);
}
}
 
