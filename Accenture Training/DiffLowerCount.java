import java.util.*;

public class DiffLowerCount {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int d = obj.nextInt();
        int n = obj.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
            int val = Math.abs(a[i] - num);
            if (val < d)
                count++; 
        }
        System.out.println(count==0 ? -1: count);
    }
}
