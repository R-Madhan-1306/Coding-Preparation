import java.util.*;
public class BMICheck {
    public static void main(String[] args) {
        Scanner obj=  new Scanner(System.in);
        int  h = obj.nextInt();
        double w = obj.nextDouble();
        System.out.println(BmiValue(h,w));
        obj.close();
    }

    private static int BmiValue(int h, double w) {
        int val = (int)(h / (w*2));
        if(val<18) return 0;
        else if(18>=val && val<25) return 1;
        else if(25>=val && val<30 ) return 2;
        else if(30>= val && val<40 ) return 3;
        else return 4;
    }
}
