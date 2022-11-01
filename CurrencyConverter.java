import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the amount: ");
        float money=sc.nextFloat();

        System.out.println("Enter the conversion you want ");
        System.out.println("Press 1 ---> USD to INR ");
        System.out.println("Press 2 ---> INR to USD ");
        int opt= sc.nextInt();

        switch(opt){
            case 1:
                System.out.println("The amount after conversion USD to INR " + money * 82.57);
                break;
            case 2:
                System.out.println("The amount after conversion  INR to USD " + money * 0.012);
                break;
            default:
                System.out.println("Enter the valid choice");
        }


    }



}
