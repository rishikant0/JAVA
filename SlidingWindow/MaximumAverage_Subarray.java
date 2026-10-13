public class MaximumAverage_Subarray {

    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        // initial window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        // sliding window
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }

    public static void main(String[] args) {
        MaximumAverage_Subarray solution = new MaximumAverage_Subarray();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println("Input: " + java.util.Arrays.toString(nums) + ", k = " + k);
        System.out.println("Output: " + solution.findMaxAverage(nums, k));
    }
}
