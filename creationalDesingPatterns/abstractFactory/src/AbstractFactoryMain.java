public class AbstractFactoryMain {

    public static void main(String[] args) {
        new GuiCreator(new WindowsGuiFactory());
        System.out.println();
        new GuiCreator(new MacGuiFactory());
    }
}
