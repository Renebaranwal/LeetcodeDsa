import java.util.*;
public class leetArmstrong {
    public static boolean isArmstrong(int n)
    {
        int orignal = n;
        int sum = 0;
        int digit = String.valueOf(n).length();
        while(n > 0)
        {
            int num = n % 10;
            sum = sum + (int)Math.pow(num, digit); //Math.pow() returns a double thats why we add (int)
            n = n / 10;
        }
        return sum == orignal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n))
        {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
    
}
