import java.util.*;
public class LCM {
    public static int findlcm(int a, int b)
    {
        for(int i = 1; i <= b; i++)
        {
            int factor = a * i;
            if(factor % b == 0)
            {
                return factor;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findlcm(a, b);
        System.out.println(result);
    }

    
}
