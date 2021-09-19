import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTypeCast {

    @Test
    public void testAutoTypeCast() {

        byte vbyte = 64;

        short vshort = vbyte;

        int vint = vshort = vbyte;

        long vlong = vint = vshort = vbyte;

        float vfloat = vlong = vint = vshort = vbyte;

        double vdouble = vfloat = vlong = vint = vshort = vbyte;


        // Equality Tests

    }

    @Test
    public void manualTypeCasting() {
        double vdouble = 3.14;

        // 1
        float vfloat = (float) vdouble;

        // 2
        long vlong = (long) vfloat;
        vlong = (long) vdouble;

        // 3
        int vint = (int) vlong;
        vint = (int) vfloat;
        vint = (int) vdouble;

        // 4
        short vshort = (short) vint;
        vshort = (short) vlong;
        vshort = (short) vfloat;
        vshort = (short) vdouble;

        // 5
        byte vbyte = (byte) vshort;
        vbyte = (byte) vint;
        vbyte = (byte) vlong;
        vbyte = (byte) vfloat;
        vbyte = (byte) vdouble;
    }

    @Test
    public void manualCastClassType() {
        String vString = "127";
        byte vbyte = Byte.parseByte(vString);
        Assertions.assertEquals(127, vbyte);

        short vshort = Short.parseShort(vString);
        Assertions.assertEquals(127, vshort);

        int vint = Integer.parseInt(vString);
        Assertions.assertEquals(127, vint);

        Byte b1 = Byte.parseByte("127"); // Null
        byte b2 = b1; // 0

        Integer i = Integer.valueOf(123);

        i.toString();


    }

    // TODO : Try out different combinations of type casting.
}


