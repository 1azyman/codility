package sk.lazyman.codility.l1;

/**
 * @author lazyman
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};

        System.out.println(new Solution().solution(a));
    }

    static class Solution {
        public int solution(int[] A) {
            boolean[] res = new boolean[A.length + 1];

            for (int i = 0; i < A.length; i++) {
                res[A[i] - 1] = true;
            }

            for (int i = 0; i < res.length; i++) {
                if (!res[i]) return i + 1;
            }

            return -1;
        }
    }
}
