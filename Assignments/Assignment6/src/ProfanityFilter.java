import java.util.*;

public class ProfanityFilter {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] swearWords = sc.nextLine().split(" ");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            StringBuilder output = new StringBuilder();

            for (String word : words) {

                String wordLowC = word.toLowerCase();
                String wordNoPunct = wordLowC.replaceAll("\\p{Punct}","");
                String wordPunct = wordLowC.replaceAll("[a-zA-Z]", "");
                boolean censored = false;

                for (String swearWord : swearWords) {
                    //System.out.println(swearWord);
                    String swear1 = swearWord.toLowerCase();
                    if (swearWord.isEmpty()) {
                        System.out.println(line);
                        return;
                    }

                    if (wordNoPunct.equals(swear1)) {
                        if (wordNoPunct.matches("-?\\d+(\\.\\d+)?")) {
                            output.append(CensorWord(swearWord) + " ");
                            censored = true;
                            break;
                        } else {
                            output.append(CensorWord(swearWord) + wordPunct + " ");
                            censored = true;
                            break;
                        }
                    }
                }
                if (censored == false) {
                    output.append(word + " ");

                }
            }

            System.out.println(output.toString().trim());
        }
    }

    static private String CensorWord(String word) {

        String profanity = "*&#$%";
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(profanity.charAt(i%profanity.length()));
        }

        return sb.toString();
    }
}


/*
            } else {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] words = line.split(" ");
                    StringBuilder output = new StringBuilder();

                    String swear1 = swearWord.toLowerCase();
                    for  (String word : words) {
                        String word1 = word.toLowerCase();
                        if (swear1.contains(word1)) {
                            output.append(CensorWord(swearWord) + " ");
                            break;
                        } else {
                            output.append(word + " ");
                            break;
                        }
                    }
                    System.out.println(output);
                }
            }*/



        /*

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                //System.out.println(line); //delete later
                StringBuilder output = new StringBuilder();

                for (String word : words) {
                    String word1 = word.toLowerCase();

                    for (String swearWord : swearWords) {
                        String swear1 = swearWord.toLowerCase();
                        if (word1.contains(swear1)) {
                            output.append(CensorWord(swearWord) + " ");
                            break;
                        } else {
                            output.append(word + " ");
                            break;
                        }
                    }
                    // if not profanity
                    // sb.append word
                    // else
                    // sb.append CensorWord(word1)


                }
                System.out.println(output);

            }


            //System.out.println("Swear word: " + swearWord);

        }*/

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