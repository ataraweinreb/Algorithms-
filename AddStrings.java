/**
* Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
*
* Restrictions:
* The length of both num1 and num2 is < 5100.
* Both num1 and num2 contains only digits 0-9.
* Both num1 and num2 does not contain any leading zero.
* You must not use any built-in BigInteger library or convert the inputs to integer directly.
*
* @author Atara Weinreb
*/
class AddStrings {
    public String addStrings(String num1, String num2) {
        
        while (num1.length() < num2.length()) {
            num1 = "0" + num1;
        }
        while (num2.length() < num1.length()) {
            num2 = "0" + num2;
        }
        
        StringBuilder s = new StringBuilder();
        
        int carry = 0;
        int position = num1.length() - 1;
        int temp = 0;
        
        while (position != -1) {
           temp = Integer.parseInt("" + num1.charAt(position)) + Integer.parseInt("" + num2.charAt(position)) + carry;
            if (temp < 9) {
                s.append(temp);
                carry = 0;
            }
            else {
                s.append(temp % 10);
                carry = temp / 10;
            }
            position--;
        }
        if (carry != 0) {
        	s.append(carry);
        }
        return s.reverse().toString();
    }
}
