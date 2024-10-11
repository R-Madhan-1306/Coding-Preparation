import java.util.*;

public class requireBall {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (Math.pow((i + 1), 2) - a[i]);
        }

        System.out.println(sum <= 0 ? "No ball required" : sum);
        obj.close();
    }
}
