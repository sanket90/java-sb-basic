# Type Casting

## Auto-type casting
- Java converts types automatically only when type to convert is smaller than the type in which we are assigning
- i.e. **byte** can be assigned to **short**

## Manual type casting
- We have to convert type manually when we are assigning larger size type into smaller one
- i.e. **short** can not be assigned to **byte** directly. we have to explicitly cast as below:
```java
class ManualTypeCast {
    void doCast() {
        
        short varShort = 127;
        byte varByte = (byte) varShort;
        
    }
}
```