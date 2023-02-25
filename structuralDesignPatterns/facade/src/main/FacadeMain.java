package main;

public class FacadeMain {

    public static void main(String[] args) {
        ComputerService computerService = new ComputerService();

        computerService.start();

        System.out.println("\n Работа операционной системы \n");

        computerService.stop();
    }
}
