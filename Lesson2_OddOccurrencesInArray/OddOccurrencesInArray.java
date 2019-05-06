import java.util.HashSet;
import java.util.Set;

/**
 * OddOccurrencesInArray
 */

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> s = new HashSet<Integer>();
        for (int i : A) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        return s.iterator().next();
    }
}

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr_1 = new int[] {3,9,3};
        System.out.println(s.solution(arr_1));
    }
    
}