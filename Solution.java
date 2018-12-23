public class Solution {
	
    public static int romanToInt(String s) {
        
        if (s.length() == 1) {
            return lookUp(s.charAt(0));
        }
        
        else if (s.charAt(0) == 'I' && s.charAt(1) == 'V') {
            if (s.length() == 2) 
                return 4;
            else 
                return 4 + romanToInt(s.substring(2));
        }
        
        else if (s.charAt(0) == 'I' && s.charAt(1) == 'X') {
            if (s.length() == 2) 
                return 9;
            else 
                return 9 + romanToInt(s.substring(2));
        }
        
         else if (s.charAt(0) == 'X' && s.charAt(1) == 'L') {
            if (s.length() == 2) 
                return 40;
            else 
                return 40 + romanToInt(s.substring(2));
        }
        
          else if (s.charAt(0) == 'X' && s.charAt(1) == 'C') {
            if (s.length() == 2) 
                return 90;
            else 
                return 90 + romanToInt(s.substring(2));
        }
        
         else if (s.charAt(0) == 'C' && s.charAt(1) == 'D') {
            if (s.length() == 2) 
                return 400;
            else 
                return 400 + romanToInt(s.substring(2));
        }
        
         else if (s.charAt(0) == 'C' && s.charAt(1) == 'M') {
            if (s.length() == 2) 
                return 900;
            else 
                return 900 + romanToInt(s.substring(2));
        }
        
        else
            return lookUp(s.charAt(0)) + romanToInt(s.substring(1));
    }
    
    private static int lookUp(char romanNumeral) {
        switch(romanNumeral) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
    
}