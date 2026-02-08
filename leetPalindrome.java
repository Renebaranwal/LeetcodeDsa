import java.util.*;
public class leetPalindrome {
    public static boolean isPalindrome(int n)
    {
        int orignal = n;
        int sum = 0;
        while(n > 0)
        {
            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        return sum == orignal;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n))
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
