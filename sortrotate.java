public class sortrotate {
    public static boolean sortit(int[] arr)
    {
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > arr[(i + 1) % n])
            {
                count++;
            }
        }
        return count <= 1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 1};
        boolean result = sortit(arr);
        System.out.println(result);
    }
    
}
