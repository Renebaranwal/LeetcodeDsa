import java.util.*;
public class bsort {
    static void bubble_sort(int[] arr, int n)
    {
        for(int i = n-1 ; i>= 1; i--)
        {
            int didswap = 0;
            for(int j = 0 ; j<= i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0)
            {
                break;
            }
        }

        System.out.println("After bubble sort: ");
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13 , 46, 24,52,20,9};
        int n = arr.length;
        System.out.println("Before using bubble sort: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr , n);
    }
    
}
