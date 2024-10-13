import java.util.*;
public class BallBounce {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int h = obj.nextInt();
        int v = obj.nextInt();
        int vn = obj.nextInt();
        System.out.println("Height is : "+HeightIs(h,v,vn));
        obj.close();
    }

    private static int HeightIs(int h, int v, int vn) {
        return h * (int)Math.pow(ElecityIs(v,vn), 2);
    }

    private static int ElecityIs(int v, int vn) {
        return v/vn;  
    }
}
