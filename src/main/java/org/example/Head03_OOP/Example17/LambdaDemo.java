package org.example.Head03_OOP.Example17;

public class LambdaDemo {
    public static void main(String[] args) {
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };

        System.out.println("익명 클래스: 3 + 5 = " + addAnon.operate(3, 5));
        MyCalculator addLambda = (x, y) -> x + y;
        System.out.println("람다: 3 + 5 = " + addLambda.operate(3, 5));
    }
}
