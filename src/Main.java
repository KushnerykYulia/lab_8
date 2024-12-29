/**
 * Головний клас програми.
 * Демонструє використання шаблону Abstract Factory для створення графічних компонентів.
 * @author Кушнерик Юлія
 */
public class Main {
    public static void main(String[] args) {

        WidgetFactory winAPIFactory = new WinAPIWidgetFactory();
        Application winApp = new Application(winAPIFactory);
        System.out.println("Відображення UI у стилі WinAPI:");
        winApp.renderUI();

        WidgetFactory gtkFactory = new GTKWidgetFactory();
        Application gtkApp = new Application(gtkFactory);
        System.out.println("\nВідображення UI у стилі GTK:");
        gtkApp.renderUI();
    }
}
