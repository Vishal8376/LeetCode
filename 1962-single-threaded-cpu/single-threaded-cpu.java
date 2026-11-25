class Solution {
    public int[] getOrder(int[][] tasks) {
         int n = tasks.length;
        int[][] sorted = new int[n][3];
        for(int i=0;i<n;i++){
            sorted[i][0] = tasks[i][0];
            sorted[i][1] = tasks[i][1];
            sorted[i][2] = i; 
        }
        Arrays.sort(sorted,(a,b)->a[0]-b[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[2] - b[2]))
        );

        int[] ans = new int[n];
        int i =0,k=0;long time = 0;
        while(k<n){
            if(pq.isEmpty() && time < sorted[i][0]){
                time = sorted[i][0];
            }
            while(i<n && sorted[i][0]<=time){
                pq.add(sorted[i]);
                i++;
            }
            int[] curr = pq.poll();
            ans[k++] = curr[2];
            time += curr[1];
        }
        return ans;
    }
}