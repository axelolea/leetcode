package com.axelolea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSubsets {

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreqChars = new int[26];
        int[] tmpFreqChars = new int[26];

        for(String w2: words2){
            Arrays.fill(tmpFreqChars, 0);
            for(char c: w2.toCharArray())
                tmpFreqChars[c - 'a']++;
            for(int i = 0; i < 26; i++)
                maxFreqChars[i] = Math.max(tmpFreqChars[i], maxFreqChars[i]);
        }
        List<String> universalSets = new ArrayList<>();
        
        for(String word: words1){
            Arrays.fill(tmpFreqChars, 0);
            for (char ch : word.toCharArray())
                tmpFreqChars[ch - 'a']++;

            boolean flag = true;
            for (int i = 0; i < 26; i++)
                if (maxFreqChars[i] > tmpFreqChars[i]) {
                    flag = false;
                    break;
                }
            
            if (flag)
                universalSets.add(word);
        }
        
        return universalSets;
    }
    
}
