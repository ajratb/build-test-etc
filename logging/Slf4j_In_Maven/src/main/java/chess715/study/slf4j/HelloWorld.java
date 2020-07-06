package chess715.study.slf4j;

/**
 *
 * @author ayrat
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
        Exception ex = ExceptionFactory.getIOException("!!! ошибка доступа к файлу !!!");
        logger.error("", ex);
    }
}
