import java.util.*;
public class CountOfRise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int val =0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'u')
            {
                if(count == -1)
                {
                    val++;
                }
                count++;
                
            }
            else
            {
                count--;
            }
        }
        System.out.println(val);
    }
}
