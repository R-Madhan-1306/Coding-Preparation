import java.util.*;
public class HeightOfBall {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
       /* int val = 0;
        int height =0;
        int i =1;
        while (val < n) {
            if(i <= n)
            {
                n-=i;
                height++;
            }
            else break;
            i++;
        }
         */

        int height = (-1 + (int)Math.sqrt(1 + (8 * n)))/2;
        System.out.println(height);
        obj.close();
    }
}
