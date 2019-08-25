import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileContentReader {
    public String readFileFromResources() throws IOException, URISyntaxException {

        URI uri = getClass().getResource("123").toURI();
        File f = new File(uri);
        System.out.println("file is exist: " + f.exists());
        FileReader reader = new FileReader(f);
        char[] buf = new char[24];
        reader.read(buf);
        return new String(buf);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String fileContent = new FileContentReader().readFileFromResources();
        System.out.println("file content is: " + fileContent);

    }
}
