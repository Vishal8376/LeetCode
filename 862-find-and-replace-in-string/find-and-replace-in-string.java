class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = indices.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) {
            order[i] = i;
        }
        
        Arrays.sort(order, (a, b) -> Integer.compare(indices[b], indices[a]));
        
        StringBuilder sb = new StringBuilder(s);        
        for (int idx : order) {
            int start = indices[idx];
            String src = sources[idx];
            String target = targets[idx];
            
            if (s.startsWith(src, start)) {
                sb.replace(start, start + src.length(), target);
            }
        }
        
        return sb.toString();
    }
}
