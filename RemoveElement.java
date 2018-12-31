/**
* Given an array nums and a value val, remove all instances of that value in-place and return the new length.
* Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
* The order of elements can be changed. 
* It doesn't matter what you leave beyond the new length.
*
* @author Atara Weinreb
*/

class RemoveElement {
    public static int removeElement(int[] nums, int val) {
	        int i = 0;
	        while (i < nums.length) {
	            if (nums[i] == val && i == nums.length - 1) {
	                return i;
	            }
	            else if (nums[i] == val && i < nums.length - 1) {
	                int j = i + 1;
	                while (j < nums.length && nums[j] == val) {
	                    j++;
	                }
	                if (j == nums.length) {
	                    return i;
	                }
	                else {
	                    swap(nums, i, j);
	                }
	            }
	            i++;
	        }
	        return i;
	    }
	
	    public static void swap(int[] array, int a, int b) {
	        int temp = array[b];
	        array[b] = array[a];
	        array[a] = temp;
	    }
}
