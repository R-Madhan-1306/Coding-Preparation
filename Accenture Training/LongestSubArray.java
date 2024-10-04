// You are using Java
import java.util.*;
class LongestSubArray
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }
        
        int[] res = LongestArray(a,n);
        System.out.println(res.length);
        
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        obj.close();
    }
    
    public static int[] LongestArray(int[] a, int n)
    {
        int max = 1, st = 0;
        int[] inc = new int[n];
        int[] dec = new int[n];
        Arrays.fill(inc,1);
        Arrays.fill(dec,1);
        
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                inc[i] = inc[i-1]+1;
        }
        
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
                dec[i] = dec[i+1]+1;
        }
        
        for(int i=0;i<n;i++)
        {
            int len = inc[i]+dec[i]-1;
            if(len>max)
            {
                max=len;
                st = i - inc[i]+1;
            }
        }
        
        int[] b = new int[max];
        for(int i=0;i<max;i++)
        {
            b[i] = a[st+i];
        }
    return b;
    }
}