import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHelloWorld {

// TODO revisit this once Classes and Methods are done
//    @Test
    public void testHelloWorld() {
        int a = 5, b = 10;

        HelloWorld h = new HelloWorld();
        h.swap(a, b);

        Assertions.assertEquals(10, a);
        Assertions.assertEquals(5, b);
    }
}
