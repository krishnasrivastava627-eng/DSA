class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backt(0,nums, new ArrayList<>(), ans);
        return ans;
        
    }
    public void backt(int i, int nums[],List<Integer> curr, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backt(i+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        backt(i+1,nums,curr,ans);
    }
}