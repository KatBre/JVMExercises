package org.kb;

import java.util.Random;

public class JITExercise {
    public static int sumOfNumbers = 0;


    public int[] tabGenerator(int a) {
        int[] numbersTab = new int[a];
        Random random = new Random();
        for (int i = 0; i < numbersTab.length; i++) {
            numbersTab[i] = random.nextInt();
        }
        return numbersTab;
    }

    public long countingNanos(int[] numbersTab) {
        long startNanos = System.nanoTime();
        int sumOfNumbersOne = 0;
        for (int i = 0; i < numbersTab.length; i++) {
            sumOfNumbersOne += numbersTab[i];
        }
        long endNanos = System.nanoTime();
        return endNanos - startNanos;
    }

    public long countingNanosTwo(int[] numbersTab) {
        long startNanos = System.nanoTime();
        for (int i = 0; i < numbersTab.length; i++) {
            sumOfNumbers += numbersTab[i];
        }
        long endNanos = System.nanoTime();
        return endNanos - startNanos;
    }

}






