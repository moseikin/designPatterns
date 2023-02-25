import java.util.List;
import java.util.Objects;

public class CopyableObject {
    private final String stringField;
    private final int intField;
    private final List<JustInnerObject> innerObjects;

    public CopyableObject(String stringField, int intField, List<JustInnerObject> innerObjects) {
        this.stringField = stringField;
        this.intField = intField;
        this.innerObjects = innerObjects;
    }

    public CopyableObject copy() {
        return new CopyableObject(this.stringField, this.intField, this.innerObjects);
    }

    @Override
    public String toString() {
        return "stringField='" + stringField + '\'' +
                ", intField=" + intField +
                ", innerObjects=" + innerObjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopyableObject that = (CopyableObject) o;
        return intField == that.intField &&
                Objects.equals(stringField, that.stringField) &&
                Objects.equals(innerObjects, that.innerObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringField, intField, innerObjects);
    }
}
