package two_sum;

public class two_sum {
    public int[] Solution(int[] nums, int target){
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int y = 1; y < nums.length; y++){
                if(nums[i]+nums[y] == target){
                    answer[0] = i;
                    answer[1] = y;
                }
            }
        }
        return answer;

    }
    public static void main(String args[]){
        two_sum t = new two_sum();
        for (int x : t.Solution(new int[]{1, 2, 3, 4, 5},9)){
            System.out.println(x);
        }
    }
}
