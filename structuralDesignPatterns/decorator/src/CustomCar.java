import java.util.Arrays;

public class CustomCar {

    private final StandardCar standardCar;
    private final int increaseWheelsSize;
    private final int increaseEnginePower;
    private final AdditionalAttributes[] attributes;

    public CustomCar(StandardCar standardCar, int increaseWheelsSize, int increaseEnginePower, AdditionalAttributes...attrs) {
        this.standardCar = standardCar;
        this.increaseWheelsSize = increaseWheelsSize;
        this.increaseEnginePower = increaseEnginePower;
        attributes = attrs;
    }

    public int getWheelsSize() {
        return standardCar.getWheelsSize() + increaseWheelsSize;
    }

    public int getEnginePower() {
        return standardCar.getEnginePower() + increaseEnginePower;
    }

    @Override
    public String toString() {
        return "CustomCar{" +
                "wheelsSize=" + getWheelsSize() +
                ", enginePower=" + getEnginePower() +
                ", обвес: " + Arrays.toString(attributes) +
                '}';
    }
}
