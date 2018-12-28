/**
 * We have two special characters. 
 * The first character can be represented by one bit 0. 
 * The second character can be represented by two bits (10 or 11). 
 * 
 * Given a string represented by several bits,
 * return whether the last character must be a one-bit character or not. 
 * The given string will always end with a zero.
 * 
 * Example 1:
 * Input: bits = [1, 0, 0] -> returns true
 * The only way to decode it is 2-bit character and 1-bit character. 
 * So the last character must be a 1-bit character.
 * 
 * Example 2:
 * Input: bits = [1, 1, 1, 0] -> returns false
 * The only way to decode it is 2-bit character and 2-bit character. 
 * So the last character is NOT a 1-bit character.
 * 
 * @author Atara Weinreb
 *
 */

public class isOneBitCharacter {
	
	  public boolean isOneBitCharacter(int[] bits) {
	        if (bits.length == 1) {
	            return true;
	        }
	        /* If i is 1, increment by 2, because 1
	         * by itself is not a valid element. 
	         * The loop ends with i being the last
	         * or second to last position. If bits[i] 
	         * is 1, it means we are at the second to last
	         * position, and the values can be decoded as
	         * 10 -> a 2 bit character. If bits[i] is 0,
	         * we are either at the second to last or last
	         * position, which means that we can only decode 
	         * a 1 bit character. 
	         */
	        int i;
	        for (i = 0; i < bits.length - 2; i++) {
	            if (bits[i] == 1) {
	                i += 1; //increment 2x 
	            }
	        }
	        if (bits[i] == 1)
	            return false; // can decode as 10 -> a 2 bit
	        else 
	            return true; // 00 or 0 can only be 1 bit
	    }
}
