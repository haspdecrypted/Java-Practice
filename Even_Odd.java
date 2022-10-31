/*Write a program to print whether a number is even or odd, also take input from the user.*/
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number to be tested");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Enter a value greater than zero");
        }
        else if(num%2==0) {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
