class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int rep = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                rep = nums[i];
                nums[i] = 0;
            }
            set.add(nums[i]);
        }

        Arrays.sort(nums);
        int miss = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                miss = i;
                break;
            }
        }

        return new int[]{rep, miss};
    }
}
