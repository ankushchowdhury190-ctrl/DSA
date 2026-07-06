class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int n : nums){
            result = Math.max(result, n);
        }
        int curMax = 1, curMin =1;
        for (int n : nums){
            int temp = curMax * n;
            curMax = Math.max (temp, Math.max(curMin * n, n));
            curMin = Math.min (temp, Math.min(curMin * n, n));

            result = Math.max (result, curMax);


        }
        return result;
        
    }
}