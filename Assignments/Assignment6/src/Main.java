import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = """
            
            This is a test, without any filtered words.
            """;

        //ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        //System.setIn(testInput);
        ProfanityFilter filter = new ProfanityFilter();
        //filter.main(input);

    }

}