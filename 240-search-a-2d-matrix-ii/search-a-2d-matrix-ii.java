class Solution {
    public boolean search(int[] nums , int target){
        int l = 0;
        int r = nums.length - 1;
        if(nums[l] > target || nums[r] < target)
            return false;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target)
                r = mid - 1;
            else 
                l = mid + 1;
            
        }

        return false;        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;
        for(int i = 0; i < matrix.length; i++){
            isFound = search(matrix[i] , target);
            if(isFound)
                return true;
        }
        return false;
    }
}