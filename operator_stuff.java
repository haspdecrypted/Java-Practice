/*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
import java.util.Scanner;
public class operator_stuff {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter first number");
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter operator (+, -, *, /)");
        char op = sc.next().charAt(0);

        if(op=='+'){
            System.out.println("The sum is : "+ (num1+num2));
            System.exit(0);
        }
        else if(op=='-'){
            System.out.println("The sub is : "+ (num1-num2));
            System.exit(0);
        }
        else if(op=='*'){
            System.out.println("The mul is : "+ (num1*num2));
            System.exit(0);
        }
        else if(op=='/'){
            System.out.println("The div is : "+ (num1/num2));
            System.exit(0);
        }

    }
}
