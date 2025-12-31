package org.example.Head02_JavaProgrammingStart;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78};

        for (int s : scores) {
            System.out.println("점수: " + s);
        }
    }
}
