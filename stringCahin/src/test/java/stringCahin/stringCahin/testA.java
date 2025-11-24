import static org.junit.Assert.*;
import org.junit.Test;

public class TestA {

    @Test
    public void testAAddsH() {
        StubB stubB = new StubB();
        A a = new A(stubB); 

        String result = a.process("");

        assertEquals("H_end", result);
    }
}
