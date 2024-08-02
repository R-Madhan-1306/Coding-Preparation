import java.util.*;
class SeqNumAdd
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int n = s.length();
        try{
        for(int i=0;i<n;i++)
        {
            char f = s.charAt(i);
            char l = s.charAt(i+1);
            int sum = (f-'0') + (l-'0');
            System.out.print(sum);
        }
        }
        catch(Exception e ){}
    }
}
