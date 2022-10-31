/*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest*/
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        //float si, rate=0.0f;
        //int Ppal=0, time=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principal amount");
        int Ppal=sc.nextInt();

        System.out.println("Enter the time (in years)");
        float time=sc.nextFloat();

        System.out.println("Enter the rate (decimals accepted)");
        float rate=sc.nextFloat();

        float si= Ppal * rate * time;

        System.out.println("your simple interest is: " + si/100);

        System.out.println("amount after si is: " + (Ppal+ (si/100)));

    }
}
