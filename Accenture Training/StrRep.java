import java.util.*;
class StrRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String res ="";
        String val = "hi";
        if(n<0) System.out.println("invalid input");
        for (int i = 0; i < n; i++) {
            res+=val;
        }
        System.out.println(res);
        sc.close();
    }
    
}