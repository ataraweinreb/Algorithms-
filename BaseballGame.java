/**
* Given a list of strings, each string can be one of the 4 following types: 
* Integer (one round's score): Directly represents the number of points you get in this round.
* "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
* "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
* "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
*
* You need to return the sum of the points you could get in all the rounds. 
* 
* @author Atara Weinreb
*/
class BaseballGame {
       int sum = 0, last = 0, secondToLast = 0, temp = 0;
          
           Stack<Integer> s = new Stack<>();
           
           for (int i = 0; i < ops.length; i++) {
               if (ops[i].charAt(0) == '+') {
                   last = s.pop();
                   secondToLast = s.pop();
                   temp = last + secondToLast;
                   
                   sum += temp;
                   
                   s.push(secondToLast);
                   s.push(last);
                   s.push(temp);
               }
               else if (ops[i].charAt(0) == 'D') {
                   last = s.peek();
                   temp = (last * 2);
                   
                   sum += temp;
                   
                   s.push(temp);
               }
               else if (ops[i].charAt(0) == 'C') {
                   temp = s.peek();
                   s.pop();
                   
                   sum -= temp;
               }
               else {
                   temp = Integer.parseInt(ops[i]);
                   
                   sum += temp;
                   
                   s.push(temp);
               }
           }
        return sum;   
    }
}
