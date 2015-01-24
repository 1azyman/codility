package sk.lazyman.codility.l4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Viliam Repan (lazyman)
 */
public class MaxProductOfThree {

    public static void main(String[] args) {
        int[] a = {-3, 1, 2, -2, 5, 6};
        System.out.println(new Solution().solution(a));

        a = new int[]{-5, -5, 1, 1, 2};
        System.out.println(new Solution().solution(a));

        a = new int[]{-5, -5, 1, 1, 2, 10};
        System.out.println(new Solution().solution(a));
    }

    private static class Solution {

        public int solution(int[] A) {
            Arrays.sort(A);

            int res1 = A[0] * A[1] * A[A.length - 1];
            int res2 = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];

            return res1 > res2 ? res1 : res2;
        }
    }
}
