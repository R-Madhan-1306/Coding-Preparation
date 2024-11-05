import java.util.Scanner;

public class KthSmallestInMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
        int left = 1, right = m * n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countLessEqual(mid, m, n) < k) left = mid + 1;
            else right = mid;
        }
        System.out.println(left);
        sc.close();
    }

    private static int countLessEqual(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) count += Math.min(x / i, n);
        return count;
    }
}
