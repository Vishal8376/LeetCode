class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) 
            return result;

        char[] pChars = p.toCharArray();
        Arrays.sort(pChars);
        p = new String(pChars);

        int size = p.length();
        for (int i = 0; i <= s.length() - size; i++) {
            char[] arr = s.substring(i, i + size).toCharArray();
            Arrays.sort(arr);
            String sub = new String(arr);

            if (p.equals(sub)) {
                result.add(i);
            }
        }
        return result;
    }
}