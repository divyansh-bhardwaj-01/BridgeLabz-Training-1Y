import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 3};
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}