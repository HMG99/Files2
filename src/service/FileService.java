package service;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {
    public static List<String> read(String url) throws IOException {
        return Files.readAllLines(Paths.get(url));
    }
    public static void write(String url, String text) throws IOException {
        Files.write(Paths.get(url), text.getBytes());
    }
    public static void writeStandardOpenOption(String url, String text) throws IOException {
        Files.write(Paths.get(url), text.getBytes(), StandardOpenOption.APPEND);
    }
}
