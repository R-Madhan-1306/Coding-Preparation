import java.util.*;
public class FindEle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter the finding number");
        int k = obj.nextInt();
        boolean res = false;
        int i,j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(k == a[i][j])
                {
                    res = true;
                    break;
                }
            }
            if(res) break;
        }

        if(res) System.out.println("The Element is Available in ( "+i+", "+j+" )");
        else System.out.println("-1");
        obj.close();
    }
}
