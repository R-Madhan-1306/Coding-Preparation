import java.util.*;
public class StockMark {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        int c =0;
        for(int i =0;i<n;i++)
        {
            a[i] = obj.nextInt();
            if(a[i] <0) c++;
        }

        System.out.println(c);
        obj.close();
    }
}
