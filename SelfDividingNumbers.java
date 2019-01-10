/**
* A self-dividing number is a number that is divisible by every digit it contains. 
* Given a lower and upper number bound, output a list of every possible self dividing number, 
* including the bounds if possible. 
*
* @author Atara Weinreb
*/

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDiv(i)) {
                list.add(i);
            }
        }
        return list;
    }
    public boolean selfDiv(int i) {
        for (int j = i; j > 0; j /= 10) {
            if (j % 10 == 0 || i % (j % 10) != 0) {
                return false;
            }
        }
        return true;
    }
}
