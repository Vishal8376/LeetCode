class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder str = new StringBuilder(s);
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
            if(set.contains(c))
                st.push(c);
        
        int ind = 0;
        while(!st.isEmpty()){
            if(set.contains(s.charAt(ind)))
                str.setCharAt(ind , st.pop());
            ind++;
        }

        return str.toString();
    }
}