import java.util.*;

public class BalanceFruit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int m = obj.nextInt();
        int rs = obj.nextInt();
        System.out.println(BalanceFruits(a, m, rs));
        obj.close();
    }

    public static int BalanceFruits(int a, int m, int rs) {
        if (a > m)
            rs -= a - m;
        else if (a < m)
            rs += m - a;
        return rs;
    }
}
