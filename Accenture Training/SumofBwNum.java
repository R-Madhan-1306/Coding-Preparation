import java.util.*;
public class SumofBwNum {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0 && i%5==0) sum+=i;
        }
    System.out.println(sum);
    obj.close();
    }
}
