/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.wts.app;

import ru.wts.list.LinkedList;

import static ru.wts.utilities.StringUtils.join;
import static ru.wts.utilities.StringUtils.split;
import static ru.wts.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}