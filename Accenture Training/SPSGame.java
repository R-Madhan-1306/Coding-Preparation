import java.util.*;

public class SPSGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int u1 = 0, u2 = 0;
        for (int i = 0; i < n; i++) {
            String s1 = obj.next();
            String s2 = obj.next();
            s1.toLowerCase();
            s2.toLowerCase();
            if (s1.equals(s2)) {
                System.out.println("Draw");
            } else if ((s1.equals("rock") && s2.equals("scissor")) || (s1.equals("paper") && s2.equals("rock"))
                    || (s1.equals("scissor") && s2.equals("paper"))) {
                System.out.println("Player 1 is the winner");
                u1++;
            } else {
                System.out.println("Player 2 is the winner");
                u2++;
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Player 1 score is " + u1 + " and Player 2 score is " + u2);
        System.out.println("Final result: ");
        if (u1 > u2) {
            System.out.println("Player 1 is the winner");
        } else if (u1 < u2) {
            System.out.println("Player 2 is the winner");
        } else {
            System.out.println("Draw");
        }
        obj.close();

    }
}
