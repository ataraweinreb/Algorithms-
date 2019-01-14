/**
* We are given two strings, A and B.
* A shift on A consists of taking string A and moving the leftmost character to the rightmost position. 
* For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. 
* Return True if and only if A can become B after some number of shifts on A.
*
* @author Atara Weinreb
*/

class RotateString {
    public boolean rotateString(String a, String b) {
        if (a.length() == 0 && b.length() == 0) 
            return true;
        return rotateString(a, b, 0);
    }
    public boolean rotateString(String a, String b, int called) {
        if (called == a.length())
            return false;
        if (a.equals(b)) 
            return true;
        
          else {
            return rotateString(a.substring(1) + "" + a.charAt(0), b, called + 1);
        } 
    }
}
