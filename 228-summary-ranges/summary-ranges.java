class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            int st = nums[i];
            int j = i + 1;            
            while (j < nums.length && nums[j] == st + 1) {
                st++;
                j++;
            }            
            if (st != start) {
                list.add(start + "->" + st);
            } else {
                list.add(String.valueOf(start));
            }            
            i = j - 1;
        }
        return list;
    }
}
