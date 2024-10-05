import java.util.*;
public class StrContainNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int check=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                System.out.print(ch);
                check=1;
            }
            else if(check==1)
            {
                System.out.println();
                check=0;
            }
        }
    }
}
