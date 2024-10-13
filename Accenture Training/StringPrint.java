import java.util.*;
public class StringPrint {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.nextLine();
        String str = obj.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print(str);
        }
        obj.close();
    }
}
