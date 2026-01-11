 import java.util.Scanner;

public class Add{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        System.out.println(sum);
        sc.close();
    }
}

