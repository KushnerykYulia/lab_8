/**
 * Клас Application використовує фабрику WidgetFactory для створення
 * компонентів графічного інтерфейсу та їх відображення. Цей клас не знає
 * про конкретні реалізації, працює лише через абстрактні інтерфейси.
 */
class Application {
    private WidgetFactory factory;

    /**
     * Конструктор приймає фабрику, яка визначає стиль компонентів інтерфейсу.
     * @param factory фабрика для створення компонентів
     */
    public Application(WidgetFactory factory) {
        this.factory = factory;
    }

    /**
     * Метод для створення та відображення компонентів інтерфейсу.
     */
    public void renderUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.render();
        textField.render();
    }
}