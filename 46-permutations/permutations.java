class Solution {
    public void generatePermutation(int[] nums , List<List<Integer>> res , List<Integer> list , boolean[] freq){
        if(list.size() ==  nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                generatePermutation(nums , res , list , freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generatePermutation(nums , res , new ArrayList<>() , new boolean[nums.length]);
        return res;
    }
}