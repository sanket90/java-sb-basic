public class Operators {

    /**
     *
     *
     * */
    private static void unaryOperators() {

        int a = 5;
        boolean flag = false;

        System.out.println("a++ " + (a++) + "     a = " + a); // 5 (6)

        System.out.println("a-- " + (a--) + "     a = " + a); // 6 (5)

        System.out.println("++a " + (++a) + "     a = " + a); // 6 (6)

        System.out.println("--a " + (--a) + "     a = " + a); // 5 (5)

        System.out.println("!flag = "+ !flag + "     flag = " + flag);
    }

    private static void shiftOperators() {
        int x = 10, y = -10;

        /*
        Right Shift = 10/2^2 = 2.5

        Left Shift = 10*2^1 = 20
         */

        System.out.println("x>> " + (x>>2) + "     x = " + x);
        System.out.println("x<< " + (x<<3) + "     x = " + x);


        System.out.println("y>> " + (y>>1) + "     y = " + y);
        System.out.println("y>>> " + (y>>>1) + "     y = " + y);
    }

    private static void ternaryOperators() {
        int x = 10, y = -10;

        System.out.println("x == y " + (x == y ? x+y : x-y));

        int expYrs = 10;
        int minSalary = (expYrs > 5) ? 500 : 50;

        int minBaseSalary = (expYrs > 5) ? 500 : (expYrs < 5) ? 50 : 250;

        /*

        if () {

        }
        else {

        }

         */
    }

    public static void main(String[] args) {

        unaryOperators();

        // TODO arithmeticOperators();

        shiftOperators();

        // TODO relationalOperators();

        // TODO bitwiseOperators();

        // TODO logicalOperators();

        ternaryOperators();

        // TODO assignmentOperators();
    }
}
