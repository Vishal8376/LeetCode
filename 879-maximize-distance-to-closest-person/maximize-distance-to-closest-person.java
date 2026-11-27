class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] dist = new int[n];
        
        int leftDist = n;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                leftDist = 0;
            } else {
                leftDist++;
            }
            dist[i] = leftDist;
        }

        int rightDist = n;
        int maxDist = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                rightDist = 0;
            } else {
                rightDist++;
            }
            dist[i] = Math.min(dist[i], rightDist);
            maxDist = Math.max(maxDist, dist[i]);
        }

        return maxDist;
    }
}