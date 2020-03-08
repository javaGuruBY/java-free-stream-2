package by.SergeyKorshak;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.partOfPhrase();
    }


    public void partOfPhrase() {
        PhraseAnalyser analyser = new PhraseAnalyser();
        String PhraseNum1 = "Make this homework great again";
        String PhraseNum2 = "No make this homework great again";
        String PhraseNum3 = "are a good person";
        String actualResultForPhraseNum1 = analyser.analyse(PhraseNum1);
        String actualResultForPhraseNum2 = analyser.analyse(PhraseNum2);
        String actualResultForPhraseNum3 = analyser.analyse(PhraseNum3);

        String expectedResultForPhraseNum1 = "It stands no chance";
        String expectedResultForPhraseNum2 = "It could be worse";
        String expectedResultForPhraseNum3 = "It's fine,really";

        checkTest(actualResultForPhraseNum1, expectedResultForPhraseNum1, "Test 1 It stands no chance");
        checkTest(actualResultForPhraseNum2, expectedResultForPhraseNum2, "Test 2 It could be worse");
        checkTest(actualResultForPhraseNum3, expectedResultForPhraseNum3, "Test 3 It's fine,really");
    }


    public void checkTest(String actual, String expected, String testName) {
        if (expected == actual) {
            System.out.println(testName + ", has been passed!");
        } else {
            System.out.println(testName + ", has been failed!");
            System.out.println("the actual value = " + actual + " is not equal to the expected =" + expected);
        }
    }

}
