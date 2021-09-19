import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOperators {

    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        int a = 5, b = 15;

        TestOperators to = new TestOperators();
        int result = to.add(5 , 15);

        Assertions.assertEquals(20, result);
    }

    @Test
    public void testUnaryOperators() {
        int a = 5;

        // Postfix
        // System.out.println("a++ " + (a++) + "     a = " + a); // 5 (6)
        Assertions.assertEquals(a++, 5);
        Assertions.assertEquals(a, 6);

        // System.out.println("a-- " + (a--) + "     a = " + a); // 6 (5)
        Assertions.assertEquals(a--, 6);
        Assertions.assertEquals(a, 5);


        //Prefix
        // System.out.println("++a " + (++a) + "     a = " + a); // 6 (6)
        Assertions.assertEquals(++a, 6);
        Assertions.assertEquals(a, 6);

        // System.out.println("--a " + (--a) + "     a = " + a); // 5 (5)
        Assertions.assertEquals(--a, 5);
        Assertions.assertEquals(a, 5);
    }

    // TODO testArithmeticOperators();

    @Test
    public void testShiftOperators() {
        int x = 10, y = -60;

        /*
        Right Shift = 10/2^2 = 2.5 = 2

        Left Shift = 10*2^3 = 80
         */

//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toBinaryString(x>>2));
//        System.out.println(Integer.toBinaryString(x<<3));

        //System.out.println("x>> " + (x>>2) + "     x = " + x);
        Assertions.assertEquals(x>>2, 2);

        //System.out.println("x<< " + (x<<3) + "     x = " + x);
        Assertions.assertEquals(x<<3, 80);




        /*
        Right Shift = -60/2^1 = -30 (ignores sign)

        Zero prefix Right Shift =
         */
//        System.out.println(Integer.toBinaryString(60));
//        System.out.println(Integer.toBinaryString(y));
//        System.out.println(Integer.toBinaryString(y>>1));
//        System.out.println(Integer.toBinaryString(y>>>1));

        //System.out.println("y>> " + (y>>1) + "     y = " + y);
        Assertions.assertEquals(y>>1, -30);

        //System.out.println("y>>> " + (y>>>1) + "     y = " + y);
        Assertions.assertEquals(y>>>1, 2147483618);

    }

    // TODO testRelationalOperators();

    // TODO testBitwiseOperators();

    // TODO testLogicalOperators();

    // TODO testTernaryOperators();

    // TODO testAssignmentOperators();

}
