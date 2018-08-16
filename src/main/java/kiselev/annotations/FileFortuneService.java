package kiselev.annotations;

import org.springframework.stereotype.Component;

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

    private final Random random = new Random();

    @Override
    public String getFortune() {

        try {
            List<String> strings = Files.readAllLines(PATH, StandardCharsets.UTF_8);
            int index = random.nextInt(strings.size());
            return strings.get(index);
        } catch (IOException e) {
            throw new RuntimeException(String.format("File %s not found", PATH));
        }
    }
}
