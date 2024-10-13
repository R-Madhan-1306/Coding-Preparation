import java.util.*;
public class TimeFormat {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int val = x * y;
        if (val > 24 || val == 0) {
            System.out.println("-1");
        } else if (val > 12) {
            System.out.println(val - 12);
        } else {
            System.out.println(val);
        }
        obj.close();
    }
}
