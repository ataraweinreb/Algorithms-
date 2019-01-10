/**
* Implement strStr().
* Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
* @author Atara Weinreb
*/

class StrStr {
    
    public int strStr(String haystack, String needle) {
       if (needle.length() == 0) 
           return 0;
       if (haystack.length() < needle.length()) 
           return -1;
       
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i < needle.length()) {
                    return -1;
                }
                else {
                    int j = i;
                    int p = 0;
                    while (j < haystack.length() && p < needle.length() && haystack.charAt(j) == needle.charAt(p)) {
                        j++;
                        p++;
                    }
                    if (j - i == needle.length())
                        return i;
                }
            }
        }
        return -1;
    }
}
