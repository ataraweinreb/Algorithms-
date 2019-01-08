/**
* Given an integer array with even length, 
* where different numbers in this array represent different kinds of candies. 
* Each number means one candy of the corresponding kind. 
* You need to distribute these candies equally in number to brother and sister. 
* Return the maximum number of kinds of candies the sister could gain. 
*
* @author Atara Weinreb
*/
class DistributeCandies {
    public int distributeCandies(int[] candies) {
        
        if (candies.length == 0 || candies.length == 1) 
            return candies.length;
        
        Arrays.sort(candies);
        
        int answer = 1;
        int i = 1;
        while (i < candies.length) {
            if (candies[i] != candies[i - 1]) {
                answer++;
            }
            i++;
        }
        if (candies.length / 2 < answer) {
            return candies.length/2;
        }
        return answer;
    }
}
