class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[temp.length];

        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int pi = stack.pop();
                res[pi] = i-pi;
            }
            stack.push(i);
        }   
        return res;
    }
}