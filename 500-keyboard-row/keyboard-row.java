class Solution {
    public String[] findWords(String[] words) {
        List<String> set = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(int i = 0 ; i < words.length; i++){
            boolean isSame = true;
            String word = words[i].toLowerCase();
            for(char c : word.toCharArray()){
                if(first.indexOf(c) == -1){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                set.add(words[i]);
                continue;
            }

            isSame = true;
            for(char c : word.toCharArray()){
                if(second.indexOf(c) == -1){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                set.add(words[i]);
                isSame = true;
                continue;
            }

            isSame = true;
            for(char c : word.toCharArray()){
                if(third.indexOf(c) == -1){
                    isSame = false;
                    break;
                }
            }
            if(isSame){
                set.add(words[i]);
                continue;
            }
        }
        return set.toArray(new String[0]);
    }
}