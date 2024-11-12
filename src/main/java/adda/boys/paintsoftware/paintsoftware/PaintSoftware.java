package adda.boys.paintsoftware.paintsoftware;
public class PaintSoftware {
    public static void main(String[] args) {

        Window mainWindow = new Window();
        mainWindow.open();
        mainWindow.display();

        Circle circle = new Circle(5.0f, 0);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());
        circle.draw();
        circle.move();
        circle.resize();
        circle.erase();
    }
}
