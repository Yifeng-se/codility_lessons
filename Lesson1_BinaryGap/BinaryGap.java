import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Solution
 */ 
class Solution {
    public int solution(int N) {
        String sBinStr = Integer.toBinaryString(N);
        List<String> parts = new ArrayList<String>(Arrays.asList(sBinStr.split("1")));

        if (sBinStr.charAt(sBinStr.length() - 1) == '0' && parts.size() > 0) {
            parts.remove( parts.size() - 1 );
        }

        return parts.stream()
            .mapToInt( s -> s.length())
            .max().orElse(0);
    }
}
public class BinaryGap {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(529));
        System.out.println(s.solution(32));
    }
}