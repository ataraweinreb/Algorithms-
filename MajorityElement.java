/**
* Given an array of size n, find the majority element. 
* The majority element is the element that appears more than ⌊ n/2 ⌋ times.
* You may assume that the array is non-empty and the majority element always exist in the array.
*
* @author Atara Weinreb
*/

class MajorityElement {
    public int majorityElement(int[] nums) {
        
        int majority = nums.length / 2 + 1;
        Arrays.sort(nums);
        
        int temp = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
                if (count >= majority)
                    return nums[i];
            }
            else {
                count = 1;
                temp = nums[i];
            }
        }
        return -1;
    }
}
