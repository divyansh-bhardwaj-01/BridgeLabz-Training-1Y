 
import java.util.Scanner;
public class Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        
        double  result=(num1+num2+num3)/3;
        System.out.println(result);
        sc.close();
    }
}