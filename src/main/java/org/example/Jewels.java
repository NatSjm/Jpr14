package org.example;

public class Jewels {
    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return 0;
        }
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }
}
