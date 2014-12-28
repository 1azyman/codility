package sk.lazyman.codility.l2;

import java.util.Arrays;

/**
 * @author lazyman
 */
public class MaxCounters {

    public static void main(String[] args) {
        int n = 5;
        int[] a = {3, 4, 4, 6, 1, 4, 4};

        int[] res = new Solution().solution(n, a);
        System.out.println(Arrays.toString(res));
    }

    static class Solution {

        public int[] solution(int N, int[] A) {
            int[] counter = new int[N];
            int actualMax = 0;
            int usedMax = 0;


            for (int a : A) {
                if (a >= 1 && a <= N) {
                    if (counter[a - 1] < usedMax) {
                        counter[a - 1] = usedMax;
                    }

                    counter[a - 1]++;
                    if (actualMax < counter[a - 1]) {
                        actualMax = counter[a - 1];
                    }
                } else {
                    usedMax = actualMax;
                }
            }

            for (int i = 0; i < counter.length; i++) {
                if (counter[i] < usedMax) {
                    counter[i] = usedMax;
                }
            }

            return counter;
        }
    }
}
