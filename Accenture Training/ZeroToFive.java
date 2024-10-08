import java.util.*;
public class ZeroToFive {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '0')
            {
                System.out.print('5');
            }
            else System.out.print(ch);
        }
        obj.close();
    }
}
