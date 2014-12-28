package sk.lazyman.codility.l3;

import java.util.Arrays;

/**
 * @author lazyman
 */
public class GenomicRangeQuery {

    public static void main(String[] args) {
        // should be [2, 4, 1]
        System.out.println(Arrays.toString(new Solution()
                .solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));

        //should be [2, 2]
        System.out.println(Arrays.toString(new Solution()
                .solution("CC", new int[]{0, 1}, new int[]{1, 1})));

        //should be [1, 2]
        System.out.println(Arrays.toString(new Solution()
                .solution("AC", new int[]{0, 1}, new int[]{1, 1})));

        //should be [1]
        System.out.println(Arrays.toString(new Solution()
                .solution("AC", new int[]{0}, new int[]{0})));
    }

    static class Solution {

        public int[] solution(String S, int[] P, int[] Q) {
            int[][] prefix = computePrefix(S);

            int[] result = new int[P.length];
            for (int i = 0; i < result.length; i++) {
                if (P[i] == Q[i]) {
                    result[i] = getVal(S.charAt(P[i]));
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    int startCount = P[i] == 0 ? 0 : prefix[P[i] - 1][j];
                    int count = prefix[Q[i]][j] - startCount;
                    if (count > 0) {
                        result[i] = j + 1;
                        break;
                    }
                }
            }

            return result;
        }

        private int[][] computePrefix(String S) {
            int[][] prefix = new int[S.length()][4];
            for (int i = 0; i < S.length(); i++) {
                if (i > 0) {
                    prefix[i][0] = prefix[i - 1][0];
                    prefix[i][1] = prefix[i - 1][1];
                    prefix[i][2] = prefix[i - 1][2];
                    prefix[i][3] = prefix[i - 1][3];
                }

                int val = getVal(S.charAt(i));
                prefix[i][val - 1]++;
            }

            return prefix;
        }

        private int getVal(char c) {
            switch (c) {
                case 'A':
                    return 1;
                case 'C':
                    return 2;
                case 'G':
                    return 3;
                case 'T':
                    return 4;
                default:
                    return -1;
            }
        }
    }
}
