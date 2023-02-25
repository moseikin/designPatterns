public class StandardCar {
    private final int wheelsSize = 20;
    private final int enginePower = 100;

    public int getWheelsSize() {
        return wheelsSize;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return "StandardCar{" +
                "wheelsSize=" + wheelsSize +
                ", enginePower=" + enginePower +
                '}';
    }
}
