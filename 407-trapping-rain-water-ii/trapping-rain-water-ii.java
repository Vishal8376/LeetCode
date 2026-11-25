class Solution {
    public int trapRainWater(int[][] height) {
        int[] dR = { 0, 0, -1, 1 };
        int[] dC = { -1, 1, 0, 0 };

        int m = height.length;
        int n = height[0].length;
        boolean visited[][] = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < m; i++) {
            pq.add(new int[] { i, 0, height[i][0] });
            pq.add(new int[] { i, n - 1, height[i][n - 1] });
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            pq.add(new int[] { 0, i, height[0][i] });
            pq.add(new int[] { m - 1, i, height[m - 1][i] });
            visited[0][i] = true;
            visited[m - 1][i] = true;
        }
        int water = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int r = curr[0];
            int c = curr[1];
            int h = curr[2];
            for (int i = 0; i < 4; i++) {
                int nr = r + dR[i];
                int nc = c + dC[i];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n) {
                    continue;
                }
                if (visited[nr][nc])
                    continue;
                visited[nr][nc] = true;
                water += Math.max(0, h - height[nr][nc]);
                pq.add(new int[] { nr, nc, Math.max(h, height[nr][nc]) });
            }
        }
        return water;
    }
}