/**
 * Given a sorted array nums, 
 * remove the duplicates in-place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place 
 * with O(1) extra memory.
 * 
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, 
 * with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 * 
 * @author Atara Weinreb
 *
 */

public class RemoveDuplicatesFromArray {
	
    public static int removeDuplicates(int[] nums) {
        
    	//keeps track that we check for duplicates all the way to the beginning
        int start = nums.length;
        
        //edge cases
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        
        for (int i = 1; i < nums.length - 1; i++) {
            while (nums[i] == nums[i-1] && start > 1) {
                start--;
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
            }
        }
        
        //count the indices which don't have duplicates
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
        	if (nums[i] == nums[i + 1]) {
        		return count;
        	}
        	else {
        		count++;
        	}
        }
        return count;
    }
    
    public static void printArray(int[] array) {
    	for (int i = 0; i < array.length; i++) {
    		System.out.print(array[i] + " ");
    	}
    }
    
    //test program
    public static void main (String[] args) {
    	int[] a = {0,0,0,1,1,1,1,2,3,3,4,4,4,5,5,6,6,6};
    	int x = removeDuplicates(a);
    	printArray(a);
    	System.out.println(); //0 1 2 3 4 5 6 6 6 6 6 6 6 6 6 6 6 6
    	System.out.println(x); //7
    }
}