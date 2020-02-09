package org.kb;


public class App {
    public static void main(String[] args) {
        JITExercise jitExercise = new JITExercise();

        System.out.println("Generate 1 time: ");
        System.out.println(jitExercise.countingNanos(jitExercise.tabGenerator(7)));
        System.out.println("Generate 10001 times: ");
        for (int i = 0; i < 10001; i++) {
            System.out.println(jitExercise.countingNanos(jitExercise.tabGenerator(7)));
        }
        int[] tab = jitExercise.tabGenerator(1000);
        for (int i = 0; i < 1000; i++) {
            System.out.println(jitExercise.countingNanos(jitExercise.tabGenerator(7)) + "," + jitExercise.countingNanosTwo(jitExercise.tabGenerator(7)));
        }
    }
}
