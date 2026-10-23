import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list2.length; i++) {
            map.put(list2[i], i);
        }

        List<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            if (map.containsKey(list1[i])) {
                int sum = i + map.get(list1[i]);

                if (sum < minSum) {
                    minSum = sum;
                    ans.clear();
                    ans.add(list1[i]);
                } else if (sum == minSum) {
                    ans.add(list1[i]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}