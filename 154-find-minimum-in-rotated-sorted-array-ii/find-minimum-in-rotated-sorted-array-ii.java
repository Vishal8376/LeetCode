class Solution {
    public int findMin(int[] nums) {
        int ind = nums.length - 1;
        while(ind > 0){
            if(nums[ind] < nums[ind - 1])
                return nums[ind];
            ind--;
        }
        return nums[0];
    }
}