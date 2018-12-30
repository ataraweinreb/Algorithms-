/**
 * You have a total of n coins that you want to form in a staircase shape, 
 * where every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed.
 * 
 * Example: n = 5
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * Because the 3rd row is incomplete, we return 2.
 * 
 * @author Atara Weinreb
 *
 */
public class ArrangingCoins {
	public int arrangeCoins(int n) {
	        
	        int amountOfRows = 0;
	        int counter = 1;
	        
	        while (n > 0) {
	            n -= counter;
	            counter++;
	            if (n >= 0)
	                amountOfRows++;
	        }
	        
	        return amountOfRows;
	    }
}
