import java.util.*;
public class ChocoKids {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int sum = 0;
        for(int i=m;i<=n;i++)
        {
            sum+=n;
            // System.out.print(sum);
            n--; 
        }
        System.out.print(sum);
        obj.close();
    }
}
