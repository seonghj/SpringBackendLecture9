package org.example.Head03_OOP.Example18;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }

            @Override
            public void start(){
                System.out.println("추상 클래스의 start() 구현부");
            }
        };

        customTask.start();
        customTask.execute();
    }
}
