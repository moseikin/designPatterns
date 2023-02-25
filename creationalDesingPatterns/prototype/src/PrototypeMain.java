import java.util.Arrays;
import java.util.List;

public class PrototypeMain {

    public static void main(String[] args) {
        List<JustInnerObject> innerObjects = createInnerObjects();

        CopyableObject original = new CopyableObject("original", 1, innerObjects);
        System.out.println(original);

        CopyableObject copy1 = original.copy();
        CopyableObject copy2 = original.copy();

        System.out.println(copy1);
        System.out.println(copy2);

        System.out.println(original.equals(copy1));
        System.out.println(original.equals(copy2));

        System.out.println("\n --- Создание копий, реализующих интерфейс Cloneable --- \n");

        CloneabledObject original1 = new CloneabledObject("original 1", 2, createInnerObjects());
        System.out.println(original1);

        CloneabledObject copy4 = (CloneabledObject) original1.clone();

        System.out.println(copy4);
    }

    private static List<JustInnerObject> createInnerObjects() {
        return Arrays.asList(
                new JustInnerObject("inner one", 1),
                new JustInnerObject("inner two", 2),
                new JustInnerObject("inner three", 3)
        );
    }
}
