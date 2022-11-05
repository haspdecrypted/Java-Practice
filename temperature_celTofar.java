/*convert temperature from celcius to farenheit*/
import java.util.Scanner;
public class temperature_celTofar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temp in cel");
    float tempC = sc.nextFloat();
    float tempF = (tempC * 9/5) +32;
        System.out.println(tempF);
    }
}
