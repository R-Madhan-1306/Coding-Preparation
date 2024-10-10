import java.util.*;
public class SubProductArr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }
        a = subProduct(a,n);
        for(int v : a) System.out.print(v+" ");
    }

    private static int[] subProduct(int[] a, int n) {
        int[] b = new int[n];
        for(int i =0;i<n;i++)
        {
            int sum =1;
            for(int j=0;j<n;j++)
            {
                if(i==j){}
                else{
                    sum*= a[j];
                }
            }
            b[i] = sum;
        }
    return b;
        
    }
}
