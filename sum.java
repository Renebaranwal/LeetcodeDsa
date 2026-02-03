import java.util.*;
public class sum {
    public static int sumdigit(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumdigit(n);
        System.out.println(result);
        
    }
    
}
