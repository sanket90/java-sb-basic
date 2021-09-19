import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestString {

    @Test
    public void testConcat() {
        String str1 = "Hello";
        String space = " ";
        String str2 = "World";

        String hw1 = str1 + space + str2;

        String hw2 = str1.concat(space).concat(str2);

        Assertions.assertEquals("Hello World", hw1);
        Assertions.assertEquals("Hello World", hw2);
    }

    @Test
    public void testEquals() {
        /*
        123 == 123 - True

        int i1 = 123; // i1 => 115 = 123
        int i2 = 123; // i1 => 117 = 123
        i1 == i2 - True

        Integer i1 = 123; // i1 => 115 = 112 -> 123
        Integer i2 = 123; // i1 => 117 = 116 -> 123
        i1 == i2 - False
        */

        String str1 = "abc"; // str1 => 115 = 112 -> "abc"
        String str2 = "abc"; // str2 => 117 = 112 -> "abc"
        Assertions.assertTrue(str1 == str2); // True
        Assertions.assertTrue(str1.equals(str2)); // True


        str1 = new String("abc"); // str1 => 115 = 125 -> new String("abc")
        str2 = new String("abc"); // str2 => 117 = 127 -> new String("abc")
        Assertions.assertFalse(str1 == str2); // False
        Assertions.assertTrue(str1.equals(str2)); // True

    }


    @Test
    public void testLength() {
        String str1 = "Apple";

        Assertions.assertEquals(5, str1.length());
    }

    @Test
    public void testCase() {
        String str1 = "Hello World"; // ASCII A>65

        Assertions.assertEquals("HELLO WORLD", str1.toUpperCase());
        Assertions.assertEquals("hello world", str1.toLowerCase());

    }
}
