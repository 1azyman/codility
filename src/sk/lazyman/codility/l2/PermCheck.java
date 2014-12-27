package sk.lazyman.codility.l2;

/**
 * @author lazyman
 */
public class PermCheck {

    public static void main(String[] args) {
        int[] a = {4, 1, 3, 2};
        System.out.println(new Solution().solution(a));

        int[] b = {4, 1, 3};
        System.out.println(new Solution().solution(b));
    }

    static class Solution {
        public int solution(int[] A) {
            boolean[] res = new boolean[A.length];

            for (int i = 0; i < A.length; i++) {
                int index = A[i] - 1;
                if (index < 0 || index > res.length - 1) {
                    return 0;
                }
                res[index] = true;
            }

            for (int i = 0; i < res.length; i++) {
                if (!res[i]) return 0;
            }

            return 1;
        }
    }
}
