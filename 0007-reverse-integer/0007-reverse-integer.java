class Solution {
    public int reverse(int x){
        double number =0;
        int tam=String.valueOf(x).length() ;
        if(x<0) tam--;
        while (x!=0){
            tam--;
            number =number + (x%10)*(Math.pow(10,tam));
            if((number > Integer.MAX_VALUE ) ||(number<Integer.MIN_VALUE)) return 0;
            x=x/10;
        }
        int b= (int) number;
        return b;
    }
}