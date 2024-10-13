import java.util.*;
public class ZeroToFive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String res ="";
        for(int i=0;i<s.length();i++)   //100055
        {
            char ch = s.charAt(i);
            if(ch == '0')
            {
                res+="5";
            }
            else res+=ch;
        }
        System.out.println(res);
        int val  = Integer.parseInt(res);
        System.out.println(val);
        obj.close();
    }
}
