package Stringex;

import java.util.Random;

public class RandomGenerator {
    private final Random random = new Random();


    private int[] lotto;
    private int count;

    public int[] generator() {
        lotto = new int[6];
        count = 0;
        while (count < 6) {
            int num = random.nextInt(45) + 1;
            if (isUnique(num)) {
                lotto[count] = num;
                count++;
            }
        }
        return lotto;
    }

    public Boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (lotto[i] == num) {
                return false;
            }
        }
        return true;
    }
}
