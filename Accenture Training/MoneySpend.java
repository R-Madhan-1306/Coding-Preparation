import java.util.*;
public class MoneySpend {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        int[] arr = new int[t];
        for(int i =0;i<t;i++)
        {
            arr[i] = obj.nextInt();
        }
        int p = obj.nextInt();
        int sum =0;
        Arrays.sort(arr);
        for(int i =0;i<p;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        obj.close();
    }
}
