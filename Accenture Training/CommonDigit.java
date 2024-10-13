import java.util.*;
public class CommonDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int o = obj.nextInt();
        System.out.println(commonDigit(n,m,o));
        obj.close();
    }

    private static String commonDigit(int n, int m, int o) {
       String a = Integer.toString(n);
       String b = Integer.toString(m);
       String c = Integer.toString(o);

       String val ="";
       for(int i =0;i<3;i++)
       {
            char ch = a.charAt(i);
            if((c.indexOf(ch) != -1) && (b.indexOf(ch) != -1)) val+=ch+" ";
       }
       return val;
    }
}
