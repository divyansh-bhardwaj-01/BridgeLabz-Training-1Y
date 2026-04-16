import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int num = 102030;
        String ans = String.valueOf(num).replace('0', '1');
        int finalNum = Integer.parseInt(ans);
        System.out.println("After replacing: " + finalNum);
    }
}
