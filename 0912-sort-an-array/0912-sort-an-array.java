class Solution {
    public int[] sortArray(int[] nums) {
       mergesort(nums,0,nums.length-1);
       return nums; 
    }
    static void mergesort(int nums[] , int l, int r){
        if(l>=r)
        return;

        int mid = l + (r-l)/2;

        mergesort(nums, l, mid);
        mergesort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }
    static void merge(int nums[], int l, int mid, int r){
        int temp[] = new int[r-l+1];
        int i =l;
        int j = mid + 1;
        int k=0;
        while(i<=mid && j <=r){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<= mid){
            temp[k++] = nums[i++];
        }
        while(j<=r){
            temp[k++] = nums[j++];
        }
        for(i=l, k=0;i <= r;  i++,k++){
            nums[i]= temp[k];
        }
    }
}