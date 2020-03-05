package by.EvgKor;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest=new PhraseAnalyserTest();
        PhraseAnalyserTest.partOfPhrase();
    }
    public static void partOfPhrase(){
        PhraseAnalyser analyser=new PhraseAnalyser();
        String PhraseNum1="Make this homework great again";
        String PhraseNum2="Make this computer better";
        String PhraseNum3="You are a good person";
        String expectedResultForPhraseNum1="It stands no chance";
        String expectedResultForPhraseNum2="It could be worse";
        String expectedResultForPhraseNum3="It's fine,really";
        String actualResultForPhraseNum1=analyser.analyse(PhraseNum1);
        String actualResultForPhraseNum2=analyser.analyse(PhraseNum2);
        String actualResultForPhraseNum3=analyser.analyse(PhraseNum3);
        checkIt(expectedResultForPhraseNum1,actualResultForPhraseNum1,"It stands no chance");
        checkIt(expectedResultForPhraseNum2,actualResultForPhraseNum2,"It could be worse");
        checkIt(expectedResultForPhraseNum3,actualResultForPhraseNum3,"It's fine,really");
    }
    public static void checkIt(String expected, String actual, String textPhrase){
        if(expected==actual){
            System.out.println(textPhrase+" has been passed");
        }
        else {
            System.out.println(textPhrase+" has been failed");
            System.out.println("Expected "+expected+" but actual "+actual);
        }
    }
}
