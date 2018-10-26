package waytosky;
//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service{
	public String getMessage(){
		return "start-app says hello!";
	}
	
	public static void main(String[] args) {
		Logger lg = LoggerFactory.getLogger(Service.class);
		lg.debug("debug msg!");
		System.out.println(new Service().getMessage());
	}
}
