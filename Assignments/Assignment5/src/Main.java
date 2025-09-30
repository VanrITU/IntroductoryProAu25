import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = """
            AVAILABLE
            1 kg lemon
            200 g apple
            500 g tomato
            300 g salt
            RECIPE 1
            100 g lemon
            500 g milk
            1 kg rice
            800 g tomato
            RECIPE 2
            1 kg apple
            100 g tomato
            300 g hazelnut
            500 g almond
            1 kg walnuts
            """;

        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput);
        ShoppingList list = new ShoppingList();
        list.read();
        list.printShoppingList();
    }

}