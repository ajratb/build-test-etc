package waytosky;

public class Service{
	
	public String getMessage(){
		return "start-app says hello!";
	}
	
	public static void main(String[] args) {
		Service srv = new Service();
		          System.out.println(srv.getMessage());
	}
}