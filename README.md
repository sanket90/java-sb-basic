# JAVA Basics

## Features of JAVA
- Secure
- Easy to Learn and Adapt
- Very large community
- Widely used ( Approx 3bn devices )
- J2SE, J2EE, J2ME
- Fast and Scalable
- Object Oriented
- Multi Threading
- Garbage Collection
- Multi Platform


## First Java Class

```java
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
    }
}

```


## Variables

- Fundamental memory container to be used for our code/ logic.
- Before using variables we have to initialise it.
- Variables can have optional assignment operations at time of initialisation;
- Input for method = Parameter
- Input to method = Arguments
 ```java

// <Data type> <name of variable> <= optional assignment>;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 100;
        int y;
        
        int a, b;
        int l,m = 5,n,o = 10,p,q;
        //code block...
        
        y = 50;
        
        // In here a,b are Arguments
        add(a, b);
        
        y = y + 100;
    }

    /**
     * 
     * @param a Parameter variable int A
     * @param b Parameter variable int B
     */
    static void add(int a, int b) {
        
    }
}

```


## Data Types

## JUnit tests