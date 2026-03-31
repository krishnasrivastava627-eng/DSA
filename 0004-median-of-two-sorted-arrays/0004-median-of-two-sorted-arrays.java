class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int merge[] = new int[n+m];
       int i =0;
       int k =0;
       int j =0;

       while(i<n && j< m){
        if(nums1[i] < nums2[j]){
            merge[k++] = nums1[i++];
        }else{
            merge[k++] = nums2[j++];
        }
       } 
       while(i < n) merge[k++] = nums1[i++];
       while(j<m) merge[k++] = nums2[j++];

       int t = n+m;
       if(t%2==0){
        return (merge[t/2 - 1]+ merge[t/2])/ 2.0;
       }else{
        return merge[t/2];
       }
    }
}