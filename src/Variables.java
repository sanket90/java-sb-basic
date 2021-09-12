public class Variables {
    public static void main(String[] args) {
        int x = 100; // Variable declaration with Assignment
        int y;  // Variable declaration without Assignment

        int a, b; // Multiple variables in single line
        int l,m = 5,n,o = 10,p,q; // Multiple variables in single line with optional assignment


        // When you pass variable to a method call as input, it is called Arguments
        // In here arg1,arg2 are Arguments to the method 'add'
        int arg1 = 1, arg2 = 2;
        add(arg1, arg2);
    }


    /**
     * @param a Parameter variable int A
     * @param b Parameter variable int B
     */
    static void add(int a, int b) {
        //When you receive variable in a method definition as input, it is called Parameter
        // In here a,b are Parameters of the method 'add'

        // code block
    }
}
