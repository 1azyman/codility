package sk.lazyman.codility.l3;

/**
 * @author lazyman
 */
public class MinAvgTwoSlice {

    public static void main(String[] args) {
        // should be 1
        System.out.println(new Solution().solution(new int[]{4, 2, 2, 5, 1, 5, 8}));

        // should be 2
        System.out.println(new Solution().solution(new int[]{4, 2, -5, 5, -5, 5, 8}));

        // should be 5
        System.out.println(new Solution().solution(new int[]{4, 5, 1, 5, 8, 2, 2}));

        // should be 4
        System.out.println(new Solution().solution(new int[]{4, 2, 5, 5, -5, 5, -5}));
    }

    static class Solution {

        public int solution(int[] A) {
            double avg = Double.MAX_VALUE;
            int index = 0;
            for (int start = 0; start < A.length - 2; start++) {
                //check 2
                int sum = A[start] + A[start + 1];
                double a = sum / 2.0;
                if (a < avg) {
                    avg = a;
                    index = start;
                }
                //check 3
                a = (sum + A[start + 2]) / 3.0;
                if (a < avg) {
                    avg = a;
                    index = start;
                }
            }

            //last 2 elements
            int sum = A[A.length - 2] + A[A.length - 1];
            return sum / 2.0 < avg ? A.length - 2 : index;
        }
    }
}
