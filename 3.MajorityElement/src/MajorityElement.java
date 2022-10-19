
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static int majorityElement(int[] nums) {
        
        int[] countArray = new int[nums.length];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            countArray[i] = 0;
            if (set.contains(nums[i])) {
                countArray[i] += 1 ;
            }
            set.add(nums[i]);
        }
       
        
         Arrays.sort(countArray);
        return countArray[countArray.length - 1];
    }
}


public class MajorityElement {

    
    public static void main(String[] args) {

        int[] nums = {3,2,3,3,3,3,2,2};
        int result = Solution.majorityElement(nums);
        System.err.println("Output: " + result);
        
    }
    
}
