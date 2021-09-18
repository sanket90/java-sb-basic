import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDataTypes {

    @Test
    public void testBoolean() {
        boolean isSelected = true, isNotSelected = false; // 1bit

        Assertions.assertTrue(isSelected);
        Assertions.assertFalse(isNotSelected);
    }

    @Test
    public void testByte() {
        byte b1 = (byte) 127; // 1byte
        Byte b2 = b1;

        Assertions.assertEquals(b2, b1);
    }

    // TODO remaining tests for other DataTypes
}
