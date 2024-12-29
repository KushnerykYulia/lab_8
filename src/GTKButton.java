/**
 * Конкретна реалізація Button для GTK.
 * Відображає кнопку у стилі GTK.
 */
class GTKButton implements Button {
    @Override
    public void render() {
        System.out.println("Відображення кнопки у стилі GTK");
    }
}