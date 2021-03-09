package palabra_morse;
import java.util.HashMap;
import java.util.Map;
/*** @author GUSTAVO */
public class Palabra_morse {
final static String[][] cod = {
{"A", ".-     "}, {"B", "-...   "}, {"C", "-.-.   "}, {"D", "-..    "},
{"E", ".      "}, {"F", "..-.   "}, {"G", "--.    "}, {"H", "....   "},
{"I", "..     "}, {"J", ".---   "}, {"K", "-.-    "}, {"L", ".-..   "},
{"M", "--     "}, {"N", "-.     "}, {"O", "---    "}, {"P", ".--.   "},
{"Q", "--.-   "}, {"R", ".-.    "}, {"S", "...    "}, {"T", "-      "},
{"U", "..-    "}, {"V", "...-   "}, {"W", ".-   - "}, {"X", "-..-   "},
{"Y", "-.--   "}, {"Z", "--..   "}, {"0", "-----  "}, {"1", ".----  "},
{"2", "..---  "}, {"3", "...--  "}, {"4", "....-  "}, {"5", ".....  "},
{"6", "-....  "}, {"7", "--...  "}, {"8", "---..  "}, {"9", "----.  "},
{"'", ".----. "}, {":", "---... "}, {",", "--..-- "}, {"-", "-....- "},
{"(", "-.--.- "}, {".", ".-.-.- "}, {"?", "..--.. "}, {";", "-.-.-. "},
{"/", "-..-.  "}, {"-", "..--.- "}, {")", "---..  "}, {"=", "-...-  "},
{"@", ".--.-. "}, {"\"", ".-..-."}, {"+", ".-.-.  "}, {" ", "/"}};
final static Map<Character, String> ascii = new HashMap<>();
static {
    for (String[] pair : cod){
        ascii.put(pair[0].charAt(0), pair[1].trim());
    }
}
    public static void main(String[] args) {
      printMorse("   Mark            Zuckerberg");
    }
    static void printMorse(String input) {
      System.out.printf("%s %n", input);
      input = input.trim().replaceAll("[ ]+", " ").toUpperCase();
      for (char c : input.toCharArray()) {
      String s = ascii.get(c);
      if (s != null){
      System.out.printf("%s ", s);
      }
    } System.out.println("\n");
  }
}