package sk.lazyman.codility.l4;

/**
 * @author Viliam Repan (lazyman)
 */
public class Triangle {

    public static void main(String[] args) {
        int[] a = {10, 2, 5, 1, 8, 20};
        System.out.println(new Solution().solution(a));

        a = new int[]{-1, 1, 2, 3, 3, 4};
        System.out.println(new Solution().solution(a));

        a = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        System.out.println(new Solution().solution(a));
    }

    static class Solution {

        public int solution(int[] A) {
            if (A == null || A.length < 3) {
                return 0;
            }

            java.util.Arrays.sort(A);
            for (int i = 0; i < A.length - 2; i++) {
                if (A[i] <= 0) {
                    continue;
                }

                if ((long) A[i] + (long) A[i + 1] > A[i + 2]) {
                    return 1;
                }
            }

            return 0;
        }
    }
}
