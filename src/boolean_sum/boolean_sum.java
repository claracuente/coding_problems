package boolean_sum;
import java.util.*;

public class boolean_sum {
    public boolean quadratic(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = 1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    return true;
                }
            }
        }
        return false;

    }
    public boolean one_pass(int[] nums, int target) {
        //data setup
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i :nums){
            map.put(i,i);
        }

        //execute check in one pass
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        boolean_sum t = new boolean_sum();
        System.out.println(t.quadratic(new int[]{10,15,3,7}, 17));
        System.out.println(t.one_pass(new int[]{10,15,3,3}, 17));
    }
}