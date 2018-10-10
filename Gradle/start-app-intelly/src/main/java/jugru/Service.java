package jugru;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service{
	public String getMessage(){
		return "start-app says hello!";
	}

    public static void main(String[] args) {
        Logger fL= LoggerFactory.getILoggerFactory().getLogger("firstLog");
        fL.debug("OK all is good");
    }
}
