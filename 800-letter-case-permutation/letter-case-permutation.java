class Solution {
    private void backtrack(StringBuilder s, List<String> list, int ind) {
        if (ind == s.length()) {
            list.add(s.toString());
            return;
        }

        backtrack(s, list, ind + 1);

        if (Character.isLetter(s.charAt(ind))) {
            char originalChar = s.charAt(ind);
            
            char toggledChar = (char) (originalChar ^ 32); 
            
            s.setCharAt(ind, toggledChar);
            backtrack(s, list, ind + 1);
            s.setCharAt(ind, originalChar);
        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        backtrack(new StringBuilder(s), list, 0);
        return list;
    }
}
