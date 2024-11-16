import java.util.Scanner;
public class IT24104076Lab3Q4{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the five digit number:");
        int digit= input.nextInt();
        int digit1= digit/10000;
        int digit2= (digit/1000) %10;
        int digit3= (digit/100) %10;
        int digit4= (digit/10) %10;
        int digit5= digit %10;
        System.out.println("Output:"+digit1 +" " + digit2+" "+digit3+" "+digit4+" "+digit5 );
        
    }
}