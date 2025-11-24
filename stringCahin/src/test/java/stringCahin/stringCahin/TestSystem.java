package stringCahin.stringCahin;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSystem {

    @Test
    public void testFullSystem() {
        E e = new E();
        D d = new D(e);
        C c = new C(d);
        B b = new B(c);
        A a = new A(b);

        String result = a.process("");

        assertEquals("HELLO", result);
    }
}
