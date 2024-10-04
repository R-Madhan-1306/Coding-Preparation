// You are using Java
import java.util.*;
class StrMaxOper
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(maxOper(s, new HashMap<>()));
        obj.close();
    }
    
    public static int maxOper(String s , Map<String, Integer> m)
    {
        if(s.isEmpty()) return 0;
        if(m.containsKey(s)) return m.get(s);
        
        int max = 1;
        
        for(int i=1;i<=s.length()/2;i++)
        {
            if(s.substring(0, i).equals(s.substring(i, 2*i)))
                max = Math.max(max , 1+maxOper(s.substring(i),m));
        }
        m.put(s,max);
    return max;
    }
}
