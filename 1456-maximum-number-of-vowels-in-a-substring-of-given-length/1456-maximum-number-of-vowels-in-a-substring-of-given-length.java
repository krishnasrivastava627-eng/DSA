class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        int max = 0;
        for(int i= 0;i<k;i++){
            char ch = s.charAt(i);
            if(isvowel(ch)){
                c++;
            }
        }
        max = c;

        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                c++;
            }
            if(isvowel(s.charAt(i-k))){
                c--;
            }
            max = Math.max(max,c);
        }
        return max;


        
    }
    public boolean isvowel(char ch){
        return ch == 'a'||
                ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}