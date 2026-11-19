class Solution {
    public int findMax(int[] nums , int n){
        int max = 0;
        for(int i = 0; i < n; i++)
            max = max > nums[i] ? max : nums[i];

        return max;
    }

    public String[] findRelativeRanks(int[] score) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1 , "Gold Medal");
        map.put(2 , "Silver Medal");
        map.put(3 , "Bronze Medal");

        String[] rank = new String[score.length];
        int count = 0;
        int s = score.length;
        for(int i = 0; i < s ; i++){
            int max = findMax(score , s);

            for(int j = 0 ; j < s ; j++){
                if(score[j] == max){
                    count++;
                    rank[j] = map.getOrDefault(count , String.valueOf(count));
                    score[j] = -1;
                    break;
                }
            }
        }

        return rank;
    }
}