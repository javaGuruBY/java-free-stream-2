package by.SergeyKorshak;

public class PhraseAnalyser {
    public String analyse(String text){
        if (text.startsWith("Make") & text.endsWith("great again")){
            return  ("It stands no chance");
        }
        else if (text.startsWith("Make") | text.endsWith("great again")){
            return  ("It could be worse");
        }
        else {
            return  ("It's fine,really");
        }
    }
}
