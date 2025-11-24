import static org.junit.Assert.*;
import org.junit.Test;

public class TestC {

    @Test
    public void testCAddsL() {
        StubD stubD = new StubD();
        C c = new C(stubD);

        String result = c.process("HE");

        assertEquals("HEL_end", result);
    }
}
