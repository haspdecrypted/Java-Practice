/* To calculate Fibonacci Series up to n numbers. */
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int n=sc.nextInt();
    int n0=0,n1=1, n2;

    if(n==0){
        System.out.println(0);
    }
    else if(n==1){
        System.out.println(1);
    }

    else
        System.out.print(n0 + " " +n1);
        for(int i=2;i<n;i++){

        //swap logic
            n2=n0+n1;
            System.out.print(" " + n2 );
            n0=n1;
            n1=n2;
        }
    }
}
