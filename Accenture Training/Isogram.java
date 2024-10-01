import java.util.*;
public class Isogram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(checkIsogram(str));
        obj.close();
    }

    public static boolean checkIsogram(String str)
    {
        int f =0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            for(int j=i+1;j<str.length();j++)
            {
                char h = str.charAt(j);
                if(c == h)
                {
                    f = 1;
                    break;
                }
            }
        }
        if(f == 1) return false;
    return true;
    }
}
