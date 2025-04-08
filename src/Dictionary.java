import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashSet;

public class Dictionary {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;

        Scanner scan = new Scanner(System.in);
        HashSet<String> dictionary = new HashSet<String>();
        String line = "";

        System.out.println("Hello operator, please enter any sentence in the English language:");
        String input = scan.nextLine();

        String[] sentence = input.split(" ");

        try {
            inputStream = new BufferedReader(new FileReader(
                    "C:\\Users\\wasay\\OneDrive\\Documents\\Dev\\ICS3U1 Sem 2\\ASS8\\Dictionary\\src\\Dictionary.txt"));
            while ((line = inputStream.readLine()) != null) {
                dictionary.add(line);
            }

            for (int i = 0; i < sentence.length; i++) {
                dictionary.contains(sentence[i]);

                if (dictionary.contains(sentence[i])) {
                    System.out.println(Integer.toString(i) + ". " + sentence[i] + " <valid>");
                } else {
                    System.out.println(Integer.toString(i) + ". " + sentence[i] + " <invalid>");
                }
            }

        } catch (java.lang.NullPointerException exception) {
            System.out.println("error reading");
        } catch (java.io.FileNotFoundException exception) {
            System.out.println("error reading file");
        }

        finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (scan != null) {
                scan.close();
            }
        }
    }
}

/*
 * 
 * try {
 * inputStream: use buffered reader and other readers possibly
 * ("dictionary.txt")
 * 
 * HashSet <String> dictionary = new HashSet <String>();
 * 
 * while ((line = inputStream.readLine()) != null) {
 * dictionary.add(line)
 * 
 * }
 * 
 * for (int i = 0; sentence.length; i++) {
 * dictionary.contains(sentence[i])
 * 
 * if (true) {
 * print("valid word");
 * } else {
 * print("learn how to spell mofo");
 * }
 * }
 * 
 * }
 */
