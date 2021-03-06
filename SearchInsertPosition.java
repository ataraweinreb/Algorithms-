/**
* Given a sorted array and a target value, return the index if the target is found. 
* If not, return the index where it would be if it were inserted in order.
* You may assume no duplicates in the array.
*
* @author Atara Weinreb
*/

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if (nums[i] > target) {
                break;
            }
        }
        return i;
    }
}
