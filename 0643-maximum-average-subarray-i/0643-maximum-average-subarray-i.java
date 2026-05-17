class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum =0;
        
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        double maxAvg = (double)sum/k;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i]-arr[i-k];
            double avg = (double)sum/k;
            maxAvg = Math.max(maxAvg,avg);
        }
        return(maxAvg);
    }
}