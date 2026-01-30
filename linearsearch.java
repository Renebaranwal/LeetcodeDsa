
public class linearsearch {
    public static int findnum(int[] arr, int num)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 1, 4};
        int num = 5;
        
        int index = findnum(arr, num);
        System.out.println(index);
    }
    
}
