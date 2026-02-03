//gcd= greatest common divisor
//12 = 1,2,3,4,6,12
//18 = 1,2,3,6,9,18
//common divisor = 1, 2, 3, 6
//gcd = 6
import java.util.*;
public class GCD {
    public static int findgcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = findgcd(a, b);
        System.out.println(result);
        
    }

    
}
//time comp = o(log n)