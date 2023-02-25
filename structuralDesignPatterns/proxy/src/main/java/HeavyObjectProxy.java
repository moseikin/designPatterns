package main.java;

public class HeavyObjectProxy implements HeavyObject {
    private static HeavyObject heavyObject;

    @Override
    public void process() {
        if (heavyObject == null) {
            System.out.println("Инациализация тяжеловесного объекта");
            heavyObject = new HeavyObjectImpl();
        } else {
            System.out.println("Инициализация тяжеловесного объекта не требуется");
        }

        heavyObject.process();
    }
}
