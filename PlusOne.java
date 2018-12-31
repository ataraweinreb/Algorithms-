/**
* Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
* The digits are stored such that the most significant digit is at the head of the list, 
* and each element in the array contain a single digit.
*
* You may assume the integer does not contain any leading zero, except the number 0 itself.
*
* @author Atara Weinreb
*/

class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[0] == 9) {
            if (needsMoreSpace(digits)) {
                int[] answer = new int[digits.length + 1];
                answer[0] = 1;
                for (int i = 1; i < answer.length; i++) {
                    answer[i] = 0;
                }
                return answer;
            }
        }
        return rec(digits, 0, digits.length - 1);
    }
    
    private boolean needsMoreSpace(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9)
                return false;
        }
        return true;
    }
    
    private int[] rec(int[] digits, int firstIndex, int lastIndex) {
        if (digits[lastIndex] < 9) {
            digits[lastIndex] += 1;
            return digits;
        }
        else {
            digits[lastIndex] = 0;
            return rec(digits, 0, lastIndex - 1);
        }
    }
}
