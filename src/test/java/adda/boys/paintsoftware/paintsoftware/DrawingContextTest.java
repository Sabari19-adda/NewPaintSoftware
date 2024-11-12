package adda.boys.paintsoftware.paintsoftware;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DrawingContextTest { 
    public DrawingContextTest() {
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
    public void testSetPoint() {
        DrawingContext context = new DrawingContext();
        context.setPoint();
    }
    @Test
    public void testClearScreen() {
        DrawingContext context = new DrawingContext();
        context.clearScreen();     
    }
    @Test
    public void testGetVerticalSize() {
        DrawingContext context = new DrawingContext();
        int verticalSize = context.getVerticalSize();
        assertEquals(600, verticalSize, "Vertical size should be 600.");
    }
    @Test
    public void testGetHorizontalSize() {
        DrawingContext context = new DrawingContext();
        int horizontalSize = context.getHorizontalSize();
        assertEquals(800, horizontalSize, "Horizontal size should be 800.");
    }
}
