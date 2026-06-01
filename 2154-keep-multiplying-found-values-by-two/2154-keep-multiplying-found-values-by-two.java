class Solution {
    public int findFinalValue(int[] nums, int original) {
       while (contains(nums,original)){
            original *= 2;
        }
        return original;
        
    }
    public boolean contains(int nums[], int t){
        for(int num : nums){
            if(num == t){
                return true;
            }
        }
        return false;
    }
}