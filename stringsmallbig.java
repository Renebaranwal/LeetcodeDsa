import java.util.*;
public class stringsmallbig {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String smallest = words[0];
        String largest = words[0];
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() < smallest.length())
            {
                smallest = words[i];
            }
            if(words[i].length() > largest.length())
            {
                largest = words[i];

            }
        }
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
    
}
