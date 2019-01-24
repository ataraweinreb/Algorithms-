/**
* Given an array of integers nums sorted in ascending order, 
* find the starting and ending position of a given target value.
* If the target is not found in the array, return [-1, -1].
*
* @author Atara Weinreb
*/

class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                if (answer[0] == -1) {
                    answer[0] = i;
                    answer[1] = i;
                }
                else {
                    answer[1] = i;
                }
            }
            i++;
        }
        return answer;
    }
}
