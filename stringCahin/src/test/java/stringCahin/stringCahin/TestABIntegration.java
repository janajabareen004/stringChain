import static org.junit.Assert.*;
import org.junit.Test;

public class TestABIntegration {

    @Test
    public void testAandBIntegration() {
        StubC stubC = new StubC();
        B b = new B(stubC);
        A a = new A(b);

        String result = a.process("");

        assertEquals("HE_end", result);
    }
}
