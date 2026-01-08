package org.example.Head04_JCF.Example05;

import java.util.function.Function;

public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f2 = StaticMethodRefDemo::doubleValue;

        System.out.println(f2.apply(10));
    }
}
