package sk.lazyman.codility.l3;

/**
 * @author lazyman
 */
public class CountDiv {

    public static void main(String[] args) {
        // should be 1
        System.out.println(new Solution().solution(0, 1, 11));
        // should be 3
        System.out.println(new Solution().solution(6, 11, 2));
        // should be 3
        System.out.println(new Solution().solution(1, 10, 3));
        // should be 5
        System.out.println(new Solution().solution(1, 10, 2));
        // should be 10
        System.out.println(new Solution().solution(1, 10, 1));
        // should be 3
        System.out.println(new Solution().solution(0, 4, 2));
    }

    static class Solution {

        public int solution(int A, int B, int K) {
            int result = B / K - A / K;
            if (A % K == 0) {
                result++;
            }
            return result;
        }
    }
}
