package adda.boys.paintsoftware.paintsoftware;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class WindowTest {  
    public WindowTest() {
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
    public void testOpenClose() {
        Window window = new Window();
        window.open();
        window.close();
    }
}
