public class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для МАК");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для МАК");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание Селекта для МАК");
        return new MacSelect();
    }
}
