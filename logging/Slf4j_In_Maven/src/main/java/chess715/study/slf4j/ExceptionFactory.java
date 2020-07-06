package chess715.study.slf4j;

import java.io.IOException;

/**
 *
 * @author BikchentaevAA
 */
class ExceptionFactory {

    static Exception getIOException(String msg) {
        return new IOException(msg);
    }
    
}
