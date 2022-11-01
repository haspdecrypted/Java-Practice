/* Take 2 numbers as input and print the largest number. */
import java.util.Scanner;
public class GreaterOfTwo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("The number greater is: "+ ((a>b)? a:b));
    }
}
