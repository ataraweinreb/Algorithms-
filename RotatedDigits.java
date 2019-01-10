/**
* X is a good number if after rotating each digit individually by 180 degrees, 
* we get a valid number that is different from X.  
* Each digit must be rotated - we cannot choose to leave it alone.
* A number is valid if each digit remains a digit after rotation. 
* 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 
* 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.
*
* Now given a positive number N, how many numbers X from 1 to N are good?
*
* @author Atara Weinreb
*/

class RotatedDigits {
    public int rotatedDigits(int N) {
       int count = 0; 
       for (int i = 1; i <= N; i++) {
           if (works(i)) {
               count++;
           }
       }
       return count;   
    }
    
    public boolean works(int i) {
        if (i < 10) {
           return (i == 2 || i == 5 || i == 6 || i == 9);
        } 
        boolean ans = false;
        while (i > 0) {
            if (i % 10 != 2 && i % 10 != 5 && i % 10 != 6 && i % 10 != 9) {
                if (i % 10 == 3 || i % 10 == 4 || i % 10 == 7) {
                    return false;
                }
            }
            else {
                ans = true;
            }
            i = i/10;
        }
        return ans;
    }
}
