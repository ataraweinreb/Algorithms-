/**
* Given an array of integers that is already sorted in ascending order, find two numbers such that * they add up to a specific target number.
* The function twoSum should return indices of the two numbers such that they add up to the * * target, where index1 must be less than index2.
*
* @author Atara Weinreb
*/

class TwoSumII {

    //Runtime is O(n^2)
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i] + numbers[j] == target) {
                    int[] answer = {i + 1, j + 1};
                    return answer;
                }
            }
        }
        return null;
    }
    
    //Runtime is O(n)
     public int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
