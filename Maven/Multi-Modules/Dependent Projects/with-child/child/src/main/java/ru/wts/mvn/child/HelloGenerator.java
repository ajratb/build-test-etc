package ru.wts.mvn.child;

/**
 *
 * @author BikchentaevAA
 */
public class HelloGenerator {
    public static String generate(String name){
        return "hello, " + name;
    }
    public static String getConstantHelloValue(){
        return "HELLO_VALUE";
    }
    public static int getNumberInt(){
        return 43;
    }
    public static int getSum(int i1, int i2, int i3)
    {
        return i1+ i2 + i3;
    }
}
