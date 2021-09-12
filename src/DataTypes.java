import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {

        boolean isSelected = true, isNotSelected; // 1bit
        System.out.println("Boolean isSelected = " + isSelected + "isNotSelected =  ");

        byte b1 = (byte) 127; // 1byte
        System.out.println("Byte b1 = " + b1);

        char c1 = 'a', c2 = '1'; // 1byte
        System.out.println("Char c1 = " + c1 + ", c2 = " + c2);

        short s1 = 9999; // 2byte
        System.out.println("Short s1 = " + s1);

        int i1 = 999999999; // 4byte
        System.out.println("Int i1 = " + i1);

        long l1 = 999999999999999999l; // 8byte
        System.out.println("Int l1 = " + l1);

        float f1 = 1.1111111f; // 4byte
        System.out.println("Float f1 = " + f1);

        double d1 = 1.111111111111; // 8byte
        System.out.println("Double d1 = " + d1);


        String str1 = "Hello World.!";
        System.out.println("String str1 = " + str1);


        int arr1[] = { 1, 2, 3, 4, 5};
        System.out.println("Int arr1 = " + Arrays.toString(arr1));

        int arr2[] = new int[5];
        arr2[0] = 5;
        arr2[1] = 15;
        arr2[2] = 25;
        System.out.println("Int arr2 = " + Arrays.toString(arr2));

        String str2; // Null
        str2 = ""; // Empty string, length = 0
        str2 = " "; // Space string, length = 1
    }

}
