/**
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * Assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9, return [0, 1].
 * 
 * @author Atara Weinreb
 * 
 */

public class TwoSum {
    public int[] twoSum(int[] array, int target) {
        int count = 0;
        while (count < array.length) {
            for (int i = count + 1; i < array.length; i++) {
                if (array[count] + array[i] == target) {
                    int p = count;
                    int q = i;
                    int[] answer = {p, q};
                    return answer;
                }
            }
            count++;
        }
        return null;
    }
 }
