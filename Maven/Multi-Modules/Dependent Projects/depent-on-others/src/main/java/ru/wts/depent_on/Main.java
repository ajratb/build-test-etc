package ru.wts.depent_on;

import ru.wts.mvn.child.HelloGenerator;

/**
 *
 * @author BikchentaevAA
 */
public class Main {

    public static void main(String[] args) {
        String greeting = HelloGenerator.generate("ayrat");
        System.out.println(greeting);
        String constant = HelloGenerator.getConstantHelloValue();
        System.out.println(constant);
        int number = HelloGenerator.getNumberInt();
        System.out.println(number);
        int sum = HelloGenerator.getSum(3, 2, 1);
        System.out.println(sum);
    }
}
