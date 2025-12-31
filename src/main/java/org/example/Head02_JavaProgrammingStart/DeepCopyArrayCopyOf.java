package org.example.Head02_JavaProgrammingStart;
import java.util.Arrays;

public class DeepCopyArrayCopyOf {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};

        int[] copy = Arrays.copyOf(original, original.length);

        copy[1] = 200;

        System.out.println("original = " + Arrays.toString(original));
        System.out.println("copy     = " + Arrays.toString(copy));
    }
}
