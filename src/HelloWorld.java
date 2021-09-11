/**
 * This is java doc
 */
//Class
public class HelloWorld {

    /**
     * This is a sample java doc
     * @param args
     */
    // Method
    public static void main(String[] args) {
        System.out.println("Hello, World.!");




        int a = 10, b = 5;

        swap(a, b);
    }

    private static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}


