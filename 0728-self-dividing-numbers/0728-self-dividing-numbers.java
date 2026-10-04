class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int n = left; n <= right; n++) {
            if (isSelfDividing(n)) {
                ans.add(n);
            }
        }

        return ans;
    }

    private boolean isSelfDividing(int n) {
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0 || n % digit != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
}