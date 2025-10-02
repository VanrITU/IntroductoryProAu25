import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = """
            fuck
            Go Fuck yourself
            fuck
            you
            hey!
            """;

        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput);
        ProfanityFilter filter = new ProfanityFilter();
        filter.main();

    }

}