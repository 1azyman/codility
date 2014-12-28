package sk.lazyman.codility.l3;

/**
 * @author lazyman
 */
public class PassingCars {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 1, 0, 1, 1}));

        System.out.println(new Solution().solution(new int[]{0}));

        System.out.println(new Solution().solution(new int[]{1}));

        System.out.println(new Solution().solution(new int[]{0, 0}));

        System.out.println(new Solution().solution(new int[]{1, 1}));

        System.out.println(new Solution().solution(new int[]{1, 1, 0}));
    }

    static class Solution {

        public int solution(int[] A) {
            int res = 0;

            int[] prefix = prefixSums(A);
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    res += prefix[A.length - 1] - prefix[i];
                } else {
                    int rightSum = i > 0 ? prefix[i - 1] : 0;
                    res += i - rightSum;
                }
                if (res > 2000000000) {
                    return -1;
                }
            }

            return res / 2;
        }

        public int[] prefixSums(int[] A) {
            int[] res = new int[A.length];
            res[0] = A[0];
            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] + A[i];
            }
            return res;
        }
    }
}
