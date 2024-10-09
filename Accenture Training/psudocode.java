import java.util.*;
public class psudocode {
    public static void main(String[] args) {
        int  a = 1 , b =1;
        for(int c = 3;c<=6;c++)
        {
            a = a+b;
            if(a<0 || b>0)
            {
                a = 10;
                b =11;
                continue;
            }
            b=a;
            a=b;
        }
        System.out.println(a+b);
    }
}
