package src.java.main.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray();
        Map<Character, Integer> charsIndexMap = new HashMap<>();
        if(s.equals(""))
            return 0;
        int max = 1;
        int index = 0;
        while(index < characters.length -1){
            if(charsIndexMap.containsKey(characters[index])){
                if(max < charsIndexMap.size()){
                    max = charsIndexMap.size();
                }
                index = charsIndexMap.get(characters[index])+1;
                charsIndexMap = new HashMap<>();
            }

            charsIndexMap.put(characters[index], index);
            index++;
        }
            charsIndexMap.put(characters[index], index);

        return Math.max(max, charsIndexMap.size());
    }
}
