/**
 * Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * @author Atara Weinreb
 *
 */

public class IsPalindrome {
    
    //Solved by converting to String
    public boolean isPalindrome(int x) {
        //negative numbers can't ever be palidromes
        //because -x can't be the same as x-
        if (x < 0)
            return false;
        
        String s = "" + x;
        
        String reverse = new StringBuffer(s).reverse().toString();

        if (s.equals(reverse))
            return true;
        else 
            return false; 
    }
    
  //Solved without converting to String
    public boolean isPalindrome2(int x) {
        
        if (x < 0) 
            return false;

        if (x < 10)
            return true;
    
        if (x % 10 == 0)
            return false;
        
        //Strategy: revert the last half of the number
        //and then check if it matches the first half.
        //when the original number is less than the reversed,
        //it means that we have processed 1/2 the number.
        
        int revert = 0;
        while (revert < x) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }
        
        //if length is odd, get rid of last digit
        //return true if first half (x) equals the reverted half
        return (x == revert || x == revert/10);
    }
}