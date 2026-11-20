import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (w1, w2) -> {
            int freqCompare = map.get(w2).compareTo(map.get(w1));
            if (freqCompare != 0) return freqCompare;
            return w1.compareTo(w2);
        });

        return list.subList(0, k);
    }
}
