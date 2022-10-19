
import java.util.Arrays;

class Solution2 {

    public static int SingleNumber(int[] nums) {

        Arrays.sort(nums);
        
        int tmp = 0;
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[tmp] != nums[i]) {
                return nums[tmp];
            } 
            tmp+= 2;

        }
        return nums[nums.length-1];
    }
}

    public class SingleNumber {

        public static void main(String[] args) {

            int[] nums = {4,1,2,1,2};
            int result = Solution2.SingleNumber(nums);
            System.err.println("Output: " + result);

        }

    }
