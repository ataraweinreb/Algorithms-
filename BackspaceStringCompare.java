/**
* Given two strings S and T, return if they are equal when both are typed into empty text editors. 
* # means a backspace character.
*
* Example: S = "a##c", T = "#a#c" -> returns true
* Explanation: Both S and T become "c".
*
* @author Atara Weinreb
*/

class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        
        StringBuilder s = new StringBuilder(S);
        StringBuilder t = new StringBuilder(T);
        
        int backspaceCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                s.deleteCharAt(i);
                backspaceCount++;
            }
            else {
                if (backspaceCount > 0) {
                    s.deleteCharAt(i);
                    backspaceCount--;
                }
            }
        }
        backspaceCount = 0;
        for (int i = t.length() - 1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                t.deleteCharAt(i);
                backspaceCount++;
            }
            else {
                if (backspaceCount > 0) {
                    t.deleteCharAt(i);
                    backspaceCount--;
                }
            }
        }
        return s.toString().equals(t.toString());
    }
}
