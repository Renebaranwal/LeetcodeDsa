public class leetcode283 {

    public static void moveZeros(int[] nums) {
        int n = nums.length;

        int j = 0;  
        // j → keeps track of the position where the next non-zero element should be placed

        for (int i = 0; i < n; i++) {
            // i → scans each element of the array from left to right

            if (nums[i] != 0) {
                // when a non-zero element is found,
                // swap it with the element at index j

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;  
                // move j forward to point to the next position
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }
}
