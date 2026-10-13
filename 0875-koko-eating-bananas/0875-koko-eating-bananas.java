class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1;
       int high=0;
       
       for(int j=0;j<piles.length;j++){
        high = Math.max(high,piles[j]);
       }

       int ans =0;
    

       while(low<=high){
        int mid = low + (high-low) /2;
        long hr=0;
        for(int i=0;i<piles.length;i++){
            hr +=(int)(Math.ceil((double)piles[i] / mid));
        }
        if(hr <= h){
            ans = mid;
            
            high = mid - 1;
            

        }else{
            low = mid+1;
        }
       }
       return ans;
    }
}
