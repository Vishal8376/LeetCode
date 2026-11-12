class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int num : nums)
            map.put(num , map.getOrDefault(num , 0) + 1);
        
        int[] ans = new int[2];
        int ind = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet())
            if(entry.getValue() == 1)
                ans[ind++] = entry.getKey();

        return ans;
    }
}