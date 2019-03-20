import ru.oman.login.LoginSearcherService;
import ru.oman.login.TLoginSearcherService;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");
        LoginSearcherService service = new LoginSearcherService();
        TLoginSearcherService server = service.getPort(TLoginSearcherService.class);
        String profile = server.getApplicationProfile();
        System.out.println(profile);
    }

}
