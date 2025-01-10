package com.axelolea;

public class MaximumScoreAfterSplittingAString {

    public static int maxScore(String s) {
        int totalOnes = 0;
        int zerosCount = 0;
        int onesCount = 0;
        int maxScore = 0;
        char[] sArr = s.toCharArray();
        
        // Analizamos los unos
        for(int i = 0; i < sArr.length; i++)
            if(sArr[i] == '1')
                totalOnes++;
        
        // Analizamos ahora los zeros
        for(int i = 0; i < sArr.length - 1; i++){
            if(sArr[i] == '0')
                zerosCount++;
            else
                onesCount++;
        
            // Conforme aumente los unos, reducimos el numero de unos
            int score = zerosCount + (totalOnes - onesCount);
            if(score > maxScore)
                maxScore = score;
        }
        
        return maxScore;
    }
    
}
