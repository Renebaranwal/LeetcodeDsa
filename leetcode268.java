public class leetcode268 {
    public static int missingnum(int[] nums)
    {
        int n = nums.length;
        int expectSum = n * (n + 1) / 2;
        int givensum = 0;
        for(int i = 0; i < n; i++)
        {
            givensum = givensum + nums[i];
        }
        return expectSum - givensum;

    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingnum(nums));


    }
}
