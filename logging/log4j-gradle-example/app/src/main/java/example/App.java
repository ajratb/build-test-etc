/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package example;

import org.apache.log4j.Logger;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Logger l4j = Logger.getLogger("some");
        l4j.info(new App().getGreeting());
    }
}
