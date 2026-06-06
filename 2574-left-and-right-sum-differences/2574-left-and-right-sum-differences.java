class Solution {
    public int[] leftRightDifference(int[] nums) {
        int t =0;
        for(int num:nums){
            t+= num;
        }
        int left =0;
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            t -= nums[i];
            ans[i] = Math.abs(left - t);
            left += nums[i];
        }
        return ans;
    }
}