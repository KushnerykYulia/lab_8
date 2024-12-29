/**
 * Конкретна фабрика для створення компонентів графічного інтерфейсу у стилі GTK.
 * Реалізує створення кнопок і текстових полів для GTK.
 */
class GTKWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new GTKButton();
    }

    @Override
    public TextField createTextField() {
        return new GTKTextField();
    }
}
