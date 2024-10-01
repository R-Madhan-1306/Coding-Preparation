import java.util.*;

public class DiceProb {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = 0;
        System.out.println("Possible of Dices");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == n) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        System.out.println("Number of Dices " + count);
        obj.close();
    }
}
