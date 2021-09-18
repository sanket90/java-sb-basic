# Variables

- Fundamental memory container to be used for our code/ logic.
- Before using variables we have to initialise it.
- Variables can have optional assignment operations at time of initialisation;

 ```java
/* 
Syntax:
 <Data type> <name of variable> <= optional assignment>;
*/


public class HelloWorld {
    public static void main(String[] args) {
        int x = 100; // Variable declaration with Assignment
        int y;  // Variable declaration without Assignment
        
        int a, b; // Multiple variables in single line
        int l,m = 5,n,o = 10,p,q; // Multiple variables in single line with optional assignment
        
        
        // When you pass variable to a method call as input, it is called Arguments
        // In here a,b are Arguments to the method 'add'
        add(a, b);
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

```


Note: Generally Inputs for method are called Parameter and Input to method are called Arguments.