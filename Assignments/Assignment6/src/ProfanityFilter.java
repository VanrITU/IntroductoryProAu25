import java.io.ByteArrayInputStream;
import java.util.*;

public class ProfanityFilter {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<String> swearWords = new ArrayList<>();
    private String textInput;
    private ArrayList<String> censoredWords = new ArrayList<>();
    private String textOutput;

    public ProfanityFilter() {



    }
    static public void main(String[] args) {
        /*String input = """
            hate fudgesicles
            I bleeping hate those fudgesicles.
            """;

        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput);*/

        System.out.print("Enter text: ");
        String swearWord = sc.nextLine();
        /*while (sc.hasNextLine()) {
            String line = sc.nextLine();

        }*/

        System.out.println("Swear word: " + swearWord);

    }







}




/* Outline idea

Class profanity filter
    scanner
    saving the swear words
    saving the text input
    storing the new censored format of swear words
    storing the new filtered text input

    class constructor


    scanner takes the first inputline and stores it

    scanner takes everything else at stores it

    for each swearword
    swearwords loop that takes each charachter and replaces it in a pattern
    pattern is giving like an array
    loops keeps running until end of word
    new censored swearword should be stored in another object

    loop that goes through text input and checks
    if swearword in text
        swearword becomes its censored version
        print word
        else
        print word?

 */

/*
The class profanity filter takes swear words and
replaces them with a specific pattern of charachters in the order *&#$%
depending on the length of the words
no matter the casing of the given swear words it should still be filtered!
(maybe have a function that takes the swear words and stores their
new censored form - so it easier to filter in the text)

swear words are the first line of a user input -
this can be multiple words divided by " "
the rest of the user input is the text that should
be filtered from the given first line
In the text there can be special charachters,
these should not be affected by the filter

finally we need a main method that executes the filter in some way
 */