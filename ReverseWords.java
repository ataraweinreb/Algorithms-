/**
* You need to reverse the order of characters in each word of the string 
* within a sentence while still preserving whitespace and initial word order.
*
* @author Atara Weinreb
*/

class ReverseWords {
    public String reverseWords(String s) {
        String answer = "";
        StringBuilder temp = new StringBuilder("");
        int j = 0;
        while (j < s.length()) {
            if (!Character.isWhitespace(s.charAt(j))) {
                temp.append(s.charAt(j));
            }
            else {
                answer += (temp.reverse()).toString();
                answer += " ";
                temp.setLength(0);
            }
            j++;
        }
        if (temp.length() != 0) {
            answer += (temp.reverse()).toString();
        }
        return answer;
    }
}

