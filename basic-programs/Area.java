import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.141 * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
