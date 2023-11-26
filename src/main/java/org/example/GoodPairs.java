package org.example;
import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int goodPairsCount = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int frequency : frequencyMap.values()) {
            if (frequency > 1) {
                goodPairsCount += (frequency * (frequency - 1)) / 2;
            }
        }

        return goodPairsCount;
    }
}