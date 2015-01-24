package sk.lazyman.codility.l4;

import java.util.Arrays;

/**
 * @author Viliam Repan (lazyman)
 */
public class Distinct {

    public static void main(String[] args) {
        int[] a = {2, 1, 1, 2, 3, 1};
        System.out.println(new Solution().solution(a));

        a = new int[]{1, 1, 1};
        System.out.println(new Solution().solution(a));

        a = new int[]{};
        System.out.println(new Solution().solution(a));
    }

    static class Solution {

        public int solution(int[] A) {
            if (A.length == 0) {
                return 0;
            }

            Arrays.sort(A);
            int count = 1;
            int value = A[0];
            for (int i = 1; i < A.length; i++) {
                if (value != A[i]) {
                    count++;
                    value = A[i];
                }
            }

            return count;
        }
    }
}
