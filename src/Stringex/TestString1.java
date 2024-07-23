package Stringex;

import java.util.Random;

public class TestString1 {
    public static void main(String[] args) {

        RandomGenerator random = new RandomGenerator();

        int[] lotto = random.generator();
        for (int i : lotto) {
            System.out.print(i);
        }

    }
}
