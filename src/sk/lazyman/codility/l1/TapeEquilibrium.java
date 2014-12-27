package sk.lazyman.codility.l1;

/**
 * @author lazyman
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 3};

        System.out.println(new Solution().solution(a));
    }

    static class Solution {
        public int solution(int[] A) {
            int min = Integer.MAX_VALUE;

            int left = 0;
            int right = 0;
            for (int i = 0; i < A.length; i++) {
                right += A[i];
            }

            for (int i = 0; i < A.length - 1; i++) {
                left += A[i];
                right -= A[i];

                int val = abs(left - right);
                System.out.println((i + 1) + "=>" + left + ":" + right + ">" + val);
                if (val < min) {
                    min = val;
                }
                if (min == 0) {
                    break;
                }
            }

            return min;
        }

        public int abs(int a) {
            return (a < 0) ? -a : a;
        }
    }
}
