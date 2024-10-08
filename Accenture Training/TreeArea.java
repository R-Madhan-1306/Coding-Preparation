import java.util.*;
public class TreeArea {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int r  = obj.nextInt();
        double val = Math.PI *  (Math.pow(r, 2));
        System.out.println(Math.round(val));
    }
}
