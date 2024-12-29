/**
 * Конкретна фабрика для створення компонентів графічного інтерфейсу у стилі WinAPI.
 * Реалізує створення кнопок і текстових полів для WinAPI.
 */
class WinAPIWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new WinAPIButton();
    }

    @Override
    public TextField createTextField() {
        return new WinAPITextField();
    }
}
