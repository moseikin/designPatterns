import java.util.List;

public class CloneabledObject implements Cloneable {

    private final String stringField;
    private final int intField;
    private final List<JustInnerObject> innerObjects;

    public CloneabledObject(String stringField, int intField, List<JustInnerObject> innerObjects) {
        this.stringField = stringField;
        this.intField = intField;
        this.innerObjects = innerObjects;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return "CloneabledObject{" +
                "stringField='" + stringField + '\'' +
                ", intField=" + intField +
                ", innerObjects=" + innerObjects +
                '}';
    }
}
