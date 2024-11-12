package adda.boys.paintsoftware.paintsoftware;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class PolygonTest {  
    public PolygonTest() {
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
    public void testDraw() {
        Polygon polygon = new Polygon();
        polygon.draw();
    }
    @Test
    public void testErase() {
        Polygon polygon = new Polygon();
        polygon.erase();
    }
    @Test
    public void testMove() {
        Polygon polygon = new Polygon();
        polygon.move();
    }
    @Test
    public void testResize() {
        Polygon polygon = new Polygon();
        polygon.resize();
    }
}
