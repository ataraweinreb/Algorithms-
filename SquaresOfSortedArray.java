/**
* Given an array of integers A sorted in non-decreasing order, 
* return an array of the squares of each number, also in sorted non-decreasing order.
*
* @author Atara Weinreb
*/

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
