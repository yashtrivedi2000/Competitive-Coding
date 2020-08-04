import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GFG_Find_Missing_And_Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (int i = 0; i < test_cases; i++) {
            int length = sc.nextInt();
            int[] nums = new int[length];
            for (int j = 0; j < nums.length; j++) {
                nums[j]=sc.nextInt();
            }
            int repeting_number = Integer.MAX_VALUE, missing_number = 0, val;
            for (int j = 0; j < nums.length; j++) {
                val = Math.abs(nums[j]);
                if (nums[val - 1] > 0)
                    nums[val - 1] = -nums[val - 1];
                else if(repeting_number>val)
                    repeting_number = val;
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > 0) {
                    missing_number = j + 1;
                    break;
                }
            }
            System.out.println(repeting_number + " " + missing_number);
        }
        sc.close();
    }
}