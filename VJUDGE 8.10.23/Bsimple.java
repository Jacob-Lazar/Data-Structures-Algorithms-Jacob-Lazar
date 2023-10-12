import java.util.*;
public class Bsimple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t, l, v1, v2;
        
        t = sc.nextInt();
        while(t-- > 0)
        {
            l = sc.nextInt();
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            // Dividing and getting the quotient along with the decimal part    
            double htime = (double)l / v2;
            htime = Math.ceil(htime);
            
            double ttime = (double)l / v1;
            ttime = Math.ceil(ttime);

            double rest = ttime - htime;
            if (rest < 0)
                System.out.println(-1);
            else
                System.out.println((int)rest - 1);
        }
        sc.close();
    }
}