public class PhraseAnalyser {
    public static String analyse(String text) {

        if ((text.startsWith("Make")) & (text.endsWith("great again"))) {
            return ("It would be great");
        }
        if ((text.startsWith("Make")) | (text.endsWith("great again"))) {
            return ("Tell me about it");
        }
        return ("I love it too");
    }
}
