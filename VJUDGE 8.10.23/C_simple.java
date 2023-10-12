import java.util.*;
public class C_simple {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Integer> l = new ArrayList<Integer>();

        n = sc.nextInt();  
        l.add(Math.abs(sc.nextInt()));

        int min = l.get(0);

        for (int i = 1; i < n; i++)
        {
            l.add(sc.nextInt());
            if (Math.abs(l.get(i)) < min)
                min = Math.abs(l.get(i));
        }
        System.out.println(min);

    }
}
