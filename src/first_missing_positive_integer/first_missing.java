package first_missing_positive_integer;

import java.util.HashMap;

public class first_missing {
    public static int find(int[] list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map100 = new HashMap<>();

        int result = 100;
        for (int i : list) {
            int minus = i - 1;
            int plus = i + 1;
            map100.put(i, 100);
            if( map.containsKey(i)){
                map.remove(i);
            }
            if (minus > 0) {
                if (map.containsKey(minus) || map100.containsKey(minus)) {
                    if (map100.containsKey(minus)) {

                    } else {
                        map.put(minus, map.get(minus) + 1);
                        if (minus < result) {
                            result = minus;
                        }
                    }
                } else {
                    map.put(minus, 1);
                }
            }
            if (plus > 0) {
                if (map.containsKey(plus) || map100.containsKey(plus)) {
                    if (map100.containsKey(plus)) {

                    } else {
                        map.put(plus, map.get(plus) + 1);
                        if (plus < result) {
                            result = plus;
                        }
                    }
                } else {
                    map.put(plus, 1);
                }
            }
        }
        if (map.size() == 1) {
            result = (int) map.keySet().toArray()[0];
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(find(new int[]{1, 2, 0}));
        System.out.println(find(new int[]{3,4,-1,1}));

    }

}