package ru.waytosky.consumer.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import ru.waytosky.lib.FileContentExtractor;

/**
 *
 * @author BikchentaevAA
 */
public class MainClass {
    public static void main(String[] args) throws IOException, FileNotFoundException, URISyntaxException {
        FileContentExtractor extractor = new FileContentExtractor();
        String result = extractor.getContent();
        System.out.println(result);
    }
}
