package sk.lazyman.codility.l2;

/**
 * @author lazyman
 */
public class FrogRiverOne {

    public static void main(String[] args) {
        int x = 5;
        int[] a = {1, 3, 1, 4, 2, 3, 5, 4};

        System.out.println(new Solution().solution(x, a));
    }

    static class Solution {

        public int solution(int X, int[] A) {
            boolean[] res = new boolean[X];

            int matched = 0;
            for (int i = 0; i < A.length; i++) {
                int index = A[i] - 1;
                if (!res[index]) matched++;
                res[index] = true;

                if (matched == res.length) {
                    return i;
                }
            }

            return -1;
        }
    }
}
