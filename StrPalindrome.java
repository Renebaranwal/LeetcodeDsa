import java.util.*;
public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String rev = new StringBuilder(num).reverse().toString();
        if(num.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        
    }
    
}
