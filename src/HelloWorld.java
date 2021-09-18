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



        HelloWorld h = new HelloWorld();
        int a = 10, b = 5;

        h.swap(a, b);

        System.out.println(a + " -- " + b);
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " -- " + b);
    }
}


