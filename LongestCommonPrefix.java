/**
* Write a function to find the longest common prefix string amongst an array of strings.
* If there is no common prefix, return an empty string "".
*
* @author Atara Weinreb
*/

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        
        StringBuilder answer = new StringBuilder();
        
        String x = strs[0];
        String y = strs[strs.length - 1];
        
        for (int i = 0; i < x.length() && i < y.length(); i++) {
            if (x.charAt(i) == y.charAt(i)) {
                answer.append(x.charAt(i));
            }
            else {
                break;
            }
        }
        
        return answer.toString();
    }
}
