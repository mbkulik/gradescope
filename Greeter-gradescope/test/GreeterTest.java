
// JUnit Tests
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(Grader.class)
public class GreeterTest {
    // THIS IS THE RIGHT ONE!
    @Test
    @Rubric(description="testSayHello()", points=50)
    public void testSayHello() {
        Greeter g = new Greeter();
        assertEquals("Hello World", g.sayHello());
    }

    @Test
    @Rubric(description="testSayGoodbye()", points=50)
    public void testSayGoodbye() {
        Greeter g = new Greeter();
        assertEquals("Goodbye World!", g.sayGoodbye());
    }
}
