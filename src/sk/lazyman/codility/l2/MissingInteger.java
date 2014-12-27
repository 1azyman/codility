package sk.lazyman.codility.l2;

/**
 * @author lazyman
 */
public class MissingInteger {

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2, 0, -1};
        System.out.println(new Solution().solution(a));

        int[] b = {1};
        System.out.println(new Solution().solution(b));

        int[] c = {2};
        System.out.println(new Solution().solution(c));

        int[] d = {-1};
        System.out.println(new Solution().solution(d));

        int[] e = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        System.out.println(new Solution().solution(e));

        int[] f = {1, 2, 10};
        System.out.println(new Solution().solution(f));
    }

    static class Solution {

        public int solution(int[] A) {
            boolean[] counter = new boolean[A.length];
            for (int a : A) {
                if (a > 0 && a <= counter.length) counter[a - 1] = true;
            }
            for (int i = 0; i < counter.length; i++) {
                if (!counter[i]) return i + 1;
            }
            return A.length + 1;
        }
    }
}
