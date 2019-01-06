/**
* Given two strings A and B of lowercase letters, 
* return true if and only if we can swap two letters in A so that the result equals B.
*
* @author Atara Weinreb
*/

class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) 
            return false;
        if (A.length() < 2 || A.equals(B) && !hasDuplicates(A)) 
            return false;
        
        char[] array = A.toCharArray();
        int switchIndex = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != B.charAt(i)) {
                if (switchIndex == -1) 
                    switchIndex = i;
                else {
                    char temp = array[i];
                    array[i] = array[switchIndex];
                    array[switchIndex] = temp;
                    switchIndex = -1;
                    break;
                }
            }
        }
        
        String modifiedA = String.copyValueOf(array);
        
        if (switchIndex != -1 || !modifiedA.equals(B))
            return false;
        
        return true;
    }
    
    public boolean hasDuplicates(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return true;
            }
        }
        return false;
    }   
}
