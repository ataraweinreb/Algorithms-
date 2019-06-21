class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int storeIndex = 0;
        int ptr = 1;
        while (ptr < nums.length) {
            if (nums[ptr] == nums[storeIndex]) {
                ptr++;
            } else {
                swap(nums, ptr, storeIndex + 1);
                storeIndex++;
                ptr++;
            }
        }
        return ++storeIndex;
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
