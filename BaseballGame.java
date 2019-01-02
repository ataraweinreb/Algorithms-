class Solution {
       public static int calPoints(String[] ops) {
        
        int sum = 0;
        int valid1 = -1000;
        int valid2 = -1000;
        
        
        for (int i = 0; i < ops.length; i++) {
            if (Character.isDigit(ops[i].charAt(0)) 
            		|| ops[i].length() > 1 && Character.isDigit(ops[i].charAt(1))) {
                int temp = Integer.parseInt(ops[i]);
                sum += temp;
                
                if (valid1 == -1000) {
                    valid1 = temp;
                }
                else if (valid2 == -1000){
                    valid2 = temp;
                }
                else { //both not negative
                    valid1 = valid2;
                    valid2 = temp;
                }
            }
            else if (ops[i].charAt(0) == '+') {
                sum += valid1 + valid2;
                
                int temp = valid1;
                valid1 = valid2;
                valid2 = temp + valid1;
            }
            else if (ops[i].charAt(0) == 'D') {
            	if (valid2 == -1000) {
            		sum += (valid1 * 2);
            		valid2 = (valid1 * 2);
            	}
            	else {
            		sum += (valid2 * 2);
            		valid1 = valid2;
                    valid2 = valid1 * 2;
            	}
            }
            else { //'C'
                if (valid1 != -1000 && valid2 == -1000) {
                    sum -= valid1;
                    valid1 = -1000;
                }
                else {
                    sum -= valid2;
                    valid2 = -1000;
                }
            }
        } 
        return sum;
    }
}
