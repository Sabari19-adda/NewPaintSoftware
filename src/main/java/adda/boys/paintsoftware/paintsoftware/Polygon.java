
package adda.boys.paintsoftware.paintsoftware;
public class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing polygon.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing polygon.");
    }

    @Override
    public void move() {
        System.out.println("Moving polygon.");
    }

    @Override
    public void resize() {
        System.out.println("Resizing polygon.");
    }
}
