/**
* There is a robot starting at position (0, 0), 
* the origin, on a 2D plane. 
* Given a sequence of its moves, 
* judge if this robot ends up at (0, 0) after it completes its moves.
*
* @author Atara Weinreb
*/

class JudgeCircle {
    public boolean judgeCircle(String moves) {
        
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') left++;
            else if (moves.charAt(i) == 'R') right++;
            else if (moves.charAt(i) == 'U') up++;
            else down++;
        }
        return left == right && up == down;
    }
}
