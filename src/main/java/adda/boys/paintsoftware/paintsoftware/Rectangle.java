
package adda.boys.paintsoftware.paintsoftware;
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing rectangle.");
    }

    @Override
    public void move() {
        System.out.println("Moving rectangle.");
    }

    @Override
    public void resize() {
        System.out.println("Resizing rectangle.");
    }
}
