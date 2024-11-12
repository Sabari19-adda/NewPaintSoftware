package adda.boys.paintsoftware.paintsoftware;
public class Circle extends Shape {
    private float radius;
    public Circle(float radius, int center) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public void setCenter(int center) {
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing circle.");
    }
    @Override
    public void erase() {
        System.out.println("Erasing circle.");
    }
    @Override
    public void move() {
        System.out.println("Moving circle.");
    }
    @Override
    public void resize() {
        System.out.println("Resizing circle.");
    }
}
