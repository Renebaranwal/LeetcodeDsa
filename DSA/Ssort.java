import java.util.*;
public class Ssort {
    static void selection_sort(int arr[] , int n)
    {
        for(int i = 0; i<=n-2; i++)
        {
            int mini = i;
            for(int j = i; j <=n - 1; j++)
            {
                if(arr[j] < arr[mini])
                {
                    mini = j;
                }

            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13 , 46 , 24 , 52 , 20 , 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr , n);
    }
    
}
