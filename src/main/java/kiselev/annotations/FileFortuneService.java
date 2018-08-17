package kiselev.annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private final static Path PATH =
            Paths.get("fortunes.txt");

    private List<String> fortunes;

    private final Random random = new Random();

    // define a default constructor
    public FileFortuneService() {
        System.out.println("FileFortuneService: inside of constructor");
    }

    // define the method of reading file
    @PostConstruct
    private void readFile() {
        try {
            System.out.println("PostConstruct: inside of readFile()");
            fortunes = Files.readAllLines(PATH, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(String.format("File %s not found", PATH));
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
