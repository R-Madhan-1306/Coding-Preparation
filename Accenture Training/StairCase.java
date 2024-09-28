import java.util.*;

public class StairCase {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        System.out.println(fibonaci(n));
    }

    public static int fibonaci(int n) {
        if (n == 1)
            return 1;
        int a = 1, b = 1, sum = 0;
        for (int i = 1; i < n; i++) {

            sum = a + b;
            System.out.println(a + " " + b + " = " + sum);
            int temp = a;
            a = b;
            b = sum;

        }
        return sum;
    }
}
