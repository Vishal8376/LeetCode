import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("\\s+");
        
        Map<String, Integer> countMap = new HashMap<>();
        String mostCommon = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                int currentCount = countMap.getOrDefault(word, 0) + 1;
                countMap.put(word, currentCount);
                
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostCommon = word;
                }
            }
        }
        
        return mostCommon;
    }
}