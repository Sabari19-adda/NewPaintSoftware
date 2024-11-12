package adda.boys.paintsoftware.paintsoftware;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class CircleTest {   
    public CircleTest() {
    }    
    @BeforeAll
    public static void setUpClass() {
    }    
    @AfterAll
    public static void tearDownClass() {
    }   
    @BeforeEach
    public void setUp() {
    }
    @AfterEach
    public void tearDown() {
    }
    @Test
    public void testArea() {
        Circle circle = new Circle(5.0f, 0);
        assertEquals(80.54, circle.area(), 0.01);
    }
    @Test
    public void testCircumference() {
        Circle circle = new Circle(5.0f, 0);
        assertEquals(31.42, circle.circumference(), 0.01);
    }
}
