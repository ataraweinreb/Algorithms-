/**
 * Given a non-negative integer num,
 * repeatedly add all its digits until the result has only one digit.
 * 
 * @author Atara Weinreb
 *
 */

public class AddDigits {

	//recursive solution
    public int addDigits(int num) {
        if (num < 10) return num;
        
        int x = 0;
        while (num != 0) {
            x += num % 10;
            num /= 10;
        }
        
        return addDigits(x);
    }
    
    //no loops or recursion
    public int addDigits2(int num) {
        if (num == 0) 
            return 0;
        if (num % 9 == 0)
            return 9;
        else 
            return num % 9;
    }
    
}
