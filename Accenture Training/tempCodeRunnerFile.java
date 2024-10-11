s1.equals("rock") && s2.equals("scissors")) || (s1.equals("paper") && s2.equals("rock"))
                    || (s1.equals("scissors") && s2.equals("paper"))) {
                u1++;
            } else {
                u2++;
            }
        }

        if (u1 > u2) {
            System.out.println("Player 1 is the winner");
        } else if (u1 < u2) {
            System.out.println("Player 2 is the winner");
        } else {