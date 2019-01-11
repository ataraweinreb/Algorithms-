/**
* Given an array of integers, find if the array contains any duplicates.
* Your function should return true if any value appears at least twice in the array, 
* and it should return false if every element is distinct.
*
* @author Tara Weinreb
*/

class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) 
                return true;
        }
        return false;
    }
}
