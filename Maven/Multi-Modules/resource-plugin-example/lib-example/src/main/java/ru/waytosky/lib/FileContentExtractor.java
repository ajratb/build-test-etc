package ru.waytosky.lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author BikchentaevAA
 */
public class FileContentExtractor {
    
    public String getContent() throws FileNotFoundException, IOException, URISyntaxException {
//        URL fileLocation = FileContentExtractor.class.getResource("/txt/123.txt");
        URL fileLocation = getClass().getResource("/txt/123.txt");
        FileReader fr = new FileReader(new File(fileLocation.toURI()));
        char[] cbuf = new char[10];
        fr.read(cbuf);
        return new String(cbuf);
    }
    
//    public static void main(String[] args) throws IOException, URISyntaxException {
//        FileContentExtractor extractor = new FileContentExtractor();
//        
//        String result = extractor.getContent();
//        System.out.println(result);
//    }
   
}
