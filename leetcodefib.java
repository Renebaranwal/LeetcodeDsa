import java.util.*;
public class leetcodefib {
    public static void findfib(int n)
    {
        int a = 0, b = 1;
        System.out.print(a + " ");
        while(b <= n)
        {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findfib(n);
    }
    
}
