package sk.lazyman.codility.l1;

/**
 * @author lazyman
 */
public class FrogJmp {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;

        System.out.println(new Solution().solution(x, y, d));
    }

    static class Solution {

        public int solution(int X, int Y, int D) {
            if (X == Y) return 0;
            return (int) Math.ceil((Y - X) / (double) D);
        }
    }
}