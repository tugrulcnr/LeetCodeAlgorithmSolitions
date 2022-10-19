
import java.util.HashSet;

class Solution {

    static public boolean containsDuplicate(int[] nums) {
        /*
                space complexity --> O(1)   time complexity --> O(n^2) 
        
        
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            int j = i + 1;
            while (j < nums.length) {
                if (tmp == nums[j]) {
                    return true;
                } else {
                    j++;
                }
            }
        }

        return false;
         */

        //  space complexity --> O(n)   time complexity --> O(n) 
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

}

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1};
        boolean result = Solution.containsDuplicate(nums);

        System.err.println("Output: " + result);

    }

}
