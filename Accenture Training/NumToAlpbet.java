import java.util.*;
public class NumToAlpbet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int v = ch -'0';
            System.out.print((char)('a'+v-1));

        }
    }
}
