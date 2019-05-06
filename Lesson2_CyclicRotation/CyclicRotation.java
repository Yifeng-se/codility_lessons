import java.util.Arrays;
import java.util.List;

/**
 * CyclicRotation
 */
class Solution { 
    public int[] solution(int[] A, int K) {
        int[] iReturnArr = new int[A.length];
        if (A.length == 0) {
            return iReturnArr;
        }
        int iReallyMove = K % A.length;
        
        for (int i = 0; i < A.length; i++) {
            iReturnArr[(i + iReallyMove) % A.length] = A[i];
        }

        return iReturnArr;
    } 
}
public class CyclicRotation {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,3,4,5};
        int k = 1;
        System.out.println(Arrays.toString(s.solution(arr, k)));
    }
}