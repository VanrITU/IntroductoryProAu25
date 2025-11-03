import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;


public class PepTalk {
    private static ArrayList<String> splittedStr = new ArrayList<>();

    public static void strSplitter(String input) {
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Matcher match = Pattern.compile("[^aeiou]?[aeiou]((ng|[^aeiou])(?![aeiou]))?",
                Pattern.CASE_INSENSITIVE).matcher(input);


        int s=0;
        while (match.find()) {
            splittedStr.add(input.substring(s, match.end()));
            s = match.end();
        }

    }


    public static StringBuilder output(String input) {
        PepTalk.strSplitter(input);
        StringBuilder output = new StringBuilder();
        String[] eachWord = input.split("\\s+");

        for (String word : eachWord) {
            splittedStr.clear();
            strSplitter(word);

            for (String ogSyl : splittedStr) {
                output.append(ogSyl);

                Matcher match = Pattern.compile("[aeiou][$\\S]?",
                        Pattern.CASE_INSENSITIVE).matcher(ogSyl);
                if (match.find()) {
                    output.append("p" + match.group());
                }
            }
            output.append(" ");
        }


        output = new StringBuilder(output.toString().trim());
        return new StringBuilder((output.substring(0, 1).toUpperCase() + output.substring(1)));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.print(PepTalk.output(input));


    }



}