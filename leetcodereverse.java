import java.util.*;
public class leetcodereverse {
    public static int reverse(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println(result);

    }
    
}
