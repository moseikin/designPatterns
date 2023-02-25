public class JustInnerObject {
    private String stringValue;
    private int intValue;

    public JustInnerObject(String stringValue, int intValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "JustInnerObject{" +
                "stringValue='" + stringValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }
}
