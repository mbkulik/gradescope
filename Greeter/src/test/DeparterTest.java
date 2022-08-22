
// JUnit Tests
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import edu.unh.cs.grader.Grader;
import edu.unh.cs.grader.Rubric;

@ExtendWith(Grader.class)
public class DeparterTest{

    @Test
    @Rubric(description="testSayGoodbye()", points=50)
    public void testSayGoodbye() {
        Greeter g = new Greeter();
        assertEquals("Goodbye World!", g.sayGoodbye());
    }
}
