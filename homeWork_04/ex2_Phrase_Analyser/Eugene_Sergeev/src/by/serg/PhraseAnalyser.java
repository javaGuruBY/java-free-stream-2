package by.serg;

public class PhraseAnalyser {
    public String analyse(String text) {
        if (text.startsWith("Make")) {
            if (text.endsWith("great again")) {
                return ("It stands no chance");
            }
            return ("It could be worse");
        } else if (text.endsWith("great again")) {
            return ("It could be worse");
        }
        return ("It is fine, really");
    }
}

