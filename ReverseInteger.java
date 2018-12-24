/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Assume we are dealing with integers 
 * within the 32-bit signed integer range: [-231,  231 - 1]. 
 * 
 * Assume that your function returns 0 when the reversed integer overflows.
 * 
 * @author Atara Weinreb
 *
 */

public class ReverseInteger {
    
    public int reverse(int x) {
    	
        boolean negative = false;
        
        if (x < 0) 
            negative = true;
        
        String s = "";
        
        if (negative) {
	        while (x != 0) {
	            s += x % 10 * -1;
	            x /= 10;
	        }
        }
        
        while (x != 0) {
            s += x % 10;
            x /= 10;
        }
        
        if (s.length() != 0) {
            try {
                int answer = Integer.parseInt(s);
                if (negative) 
                    return answer * -1;
                else 
                    return answer;
            }
            catch(Exception e) {
                return 0;
            }
        } 
        else 
            return 0;
    }
}
