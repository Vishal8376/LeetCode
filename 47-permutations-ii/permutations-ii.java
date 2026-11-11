class Solution {
    public void generateUniquePerm(int[] nums , List<Integer> list , Set<List<Integer>> set , boolean[] freq){
        if(list.size() == nums.length){
            set.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                generateUniquePerm(nums , list , set , freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        generateUniquePerm(nums , new ArrayList<>() , set , new boolean[nums.length]);
        return new ArrayList<>(set);
    }
}