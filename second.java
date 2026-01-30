public class second {
    public static void findElement(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            if(num < smallest)
            {
                secondSmallest = smallest;
                smallest = num;
            }
            else if(num > smallest && num < secondSmallest)
            {
                secondSmallest = num;
            }
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if(num < largest && num > secondLargest)
            {
                secondLargest = num;
            }
        }
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        findElement(arr);
    }
}
    

