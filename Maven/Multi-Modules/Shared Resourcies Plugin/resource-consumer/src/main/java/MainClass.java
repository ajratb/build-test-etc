import java.io.IOException;
import java.net.URISyntaxException;

public class MainClass {
    public static void main(String[] args) throws IOException, URISyntaxException {
        FileContentReader reader = new FileContentReader();
        String result = reader.readFileFromResources();
        System.out.println(result);
    }
}
