import java.util.Arrays;

public class reversestr {
    public static void reverse(char[] s)
    {
        int left = 0, right = s.length - 1;
        while(left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'r' , 'e', 'n', 'e'};
        reverse(s);
        System.out.println(Arrays.toString(s));
        
    }
    
}
