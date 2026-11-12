class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> tlist = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    tlist.add(1);
                else
                    tlist.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            list.add(tlist);
        }
        
        return list.get(rowIndex);
    }
}
