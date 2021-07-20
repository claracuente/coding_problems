package array_product_exclusion;
import java.util.*;

public class array_product_exclusion {
    public int[] division(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        for (int y = 0; y < nums.length; y++) {
            result[y] = product/nums[y];
        }
        return result;
    }
    public int[] no_division(int[] nums) {
        int moving_product = 1;
        int product = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product = 1;
            for (int y = i+1; y < nums.length; y++) {
                product *= nums[y];
            }
            result[i] = product*moving_product;
            moving_product *= nums[i];
        }
        return result;
    }

    public static void main(String args[]) {
        array_product_exclusion a = new array_product_exclusion();
        System.out.println(Arrays.toString(a.division(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(a.no_division(new int[]{1,2,3,4,5})));
        //System.out.println(t.one_pass(new int[]{10,15,3,}, 17));
    }
}
