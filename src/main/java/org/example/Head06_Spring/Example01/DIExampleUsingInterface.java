package org.example.Head06_Spring.Example01;

public class DIExampleUsingInterface {
    public static void main(String[] args) {
        MenuService realService = new MenuServiceImpl();
        MenuController controller = new MenuController(realService);
        controller.printMenu();

        MenuService stubService = new MenuServiceStub();
        MenuController testController = new MenuController(stubService);
        testController.printMenu();
    }
}
