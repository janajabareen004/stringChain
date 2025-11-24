import static org.junit.Assert.*;
import org.junit.Test;

public class TestCDIntegration {

    @Test
    public void testCandDIntegration() {
        StubE stubE = new StubE();
        D d = new D(stubE);
        C c = new C(d);
a
        String result = c.process("HE");

        assertEquals("HELL_end", result);
    }
}
