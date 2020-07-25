import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            int val = Math.abs(nums[i]);
			if (nums[val - 1] > 0)
				nums[val - 1] = -nums[val - 1];
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] > 0)
				ans.add(i + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr)); 
    }
}