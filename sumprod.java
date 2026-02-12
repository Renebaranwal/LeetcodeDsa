import java.util.*;
public class sumprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
        }
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < n; i++)
        {
            sum = sum + num[i];
            prod = prod * num[i];
        }
        System.out.println(sum);
        System.out.println(prod);
    }
    
}
