import java.util.*;

public class TripletZero {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] a = new int[n];
        for(int i= 0;i<n;i++)
        {
            a[i] = obj.nextInt();
        }

        int f= 0;
        try{
        for(int i = 0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k] == 0)
                    {
                        f=1;
                        System.out.println(a[j]+" "+a[i]+" "+a[k]);
                    }
                }
            }
        }
    }
    catch(Exception e){};
        if(f == 0 ) System.out.println("No Tripelt Zero"); 
        obj.close();
    }

}
