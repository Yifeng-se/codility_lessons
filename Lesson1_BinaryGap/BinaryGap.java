/**
 * Solution
 */ 
class Solution {
    public int solution(int N) {
        String sBinStr = Integer.toBinaryString(N);
        int iReturn = 0, iCurr = 0;
        for (char c : sBinStr.toCharArray()) {
            if (c == '1') {
                iReturn = Math.max(iReturn, iCurr);
                iCurr = 0;
            } else {
                iCurr += 1;
            }
        }
        return iReturn;
    }
}
public class BinaryGap {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(529));
        System.out.println(s.solution(32));
    }
}