package com.axelolea;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        // Map para guardar todos los complementos
        Map<Integer, Integer> numMap = new HashMap();
        int n = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            // Si existe complemento de numero actual, hay solucion
            if(numMap.containsKey(complement))
                return new int[]{numMap.get(complement), i};
            // Guardar complemento
            numMap.put(nums[i], i);
        }
        
        return null; // Sin solucion
    }
}