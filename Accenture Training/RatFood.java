import java.util.*;

class RatFood {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        int u = obj.nextInt();
        int n = obj.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
            sum += a[i];
        }
        int val = r * u;
        int j = 0;
        if (n <= 0)
            System.out.println("-1");
        else if (val > sum) {
            System.out.println("0");
        } else {
            while (val > 0) {

                val -= a[j];


                j++;
            }
            System.out.println(j);
        }

    }
}