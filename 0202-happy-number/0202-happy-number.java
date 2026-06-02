class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while( n != 1 && !set.contains(n)){
            set.add(n);
            int s =0;
            while(n>0){
                int d = n % 10;
                s += d*d;
                n = n/10;
            }
            n = s;
        }
        return n==1;
    }
}