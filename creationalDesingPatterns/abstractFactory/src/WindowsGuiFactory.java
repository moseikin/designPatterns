public class WindowsGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для Виндовс");
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание Текстового поля для Виндовс");
        return new WindowsTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание Селекта для Виндовс");
        return new WindowsSelect();
    }
}
