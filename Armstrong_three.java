/* To find Armstrong Number between two given number*/
/*an armstrong number is equal to the sum of cubes of its digits */
import java.util.Scanner;
public class Armstrong_three {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r,sum=0,temp;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        temp=num;
        while(num>0){
            r=num%10;
            sum+=(r*r*r);
            num/=10;
        }
        if(temp==sum)
            System.out.println("It is Armstrong number");
        else
            System.out.println("It is not Armstrong number");
    }
}
