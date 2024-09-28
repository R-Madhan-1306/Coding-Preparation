/*the 1 to n person is standing circurarly. The first person kill the next person no 2. then knife passing to no 3. This step continus untill 
one person left. Then find that alive person number. */

import java.util.*;
class AlivePerson
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while(a<=n)
        {
            a = a*2;
        }
        a = a/2;
        int res = (n-a)*2;
        System.out.println(res+1);
        sc.close();
    }
}