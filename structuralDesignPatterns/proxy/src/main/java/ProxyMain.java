package main.java;

public class ProxyMain {

    public static void main(String[] args) {
        HeavyObject heavyObject = new HeavyObjectProxy();

        heavyObject.process();
        heavyObject.process();
        heavyObject.process();
        heavyObject.process();
        heavyObject.process();
        heavyObject.process();
    }
}
