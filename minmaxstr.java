import java.util.*;
public class minmaxstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int minDiff = 0;
        int maxDiff = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != '?' && c2 != '?' && c1 != c2)
            {
                minDiff++;
            }
            if(c1 != c2 || c1 == '?' || c2 == '?')
            {
                maxDiff++;
            }
        }
        System.out.println(minDiff + " " + maxDiff);
        
    }
    
}
