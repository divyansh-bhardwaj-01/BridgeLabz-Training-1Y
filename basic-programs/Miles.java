 
import java.util.Scanner;
public class  Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        double miles=km*.621371;
        System.out.println(miles);
        sc.close();
    }
}