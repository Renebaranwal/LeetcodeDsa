
public class begarray {
        public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int ans = largestElement(arr);
        System.out.println(ans);
    }

    
}
