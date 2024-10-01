import java.util.*;

public class SumOfSeqNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int val = n%9;
        System.out.println(val == 0 ? 9 : val);
        obj.close();
    }    
}
