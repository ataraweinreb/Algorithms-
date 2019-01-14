/**
* Write a function that takes a string as input and reverse only the vowels of a string.
*
* @author Atara Weinreb
*/

class ReverseVowels {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;
        
        while (j > i) {
            while (i < j && !isVowel(array[i])) {
                i++;
            }
            while (i < j && !isVowel(array[j])) {
                j--;
            }
            if (i < array.length && j >= 0) {
                char temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }
        String str = new String(array);
        return str;
    }
    public boolean isVowel(char c) {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < vowels.length; i++) {
            if (c == vowels[i])
                return true;
        }
        return false;
    }
}
