public class PhraseAnalyserTest {

    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.shouldReturnOneOfThreeAnswers();
    }

    private void shouldReturnOneOfThreeAnswers() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String FirstPhrase = "Make Belarus great again";
        String SecondPhrase = "It'll be what makes it great again";
        String ThirdPhrase = "Belarus one love";
        String expectedForFirstPhrase = "It would be great";
        String expectedForSecondPhrase = "Tell me about it";
        String expectedForThirdPhrase = "I love it too";
        String actualForFirstPhrase = PhraseAnalyser.analyse(FirstPhrase);
        String actualForSecondPhrase = PhraseAnalyser.analyse(SecondPhrase);
        String actualForThirdPhrase = PhraseAnalyser.analyse(ThirdPhrase);
        Test (expectedForFirstPhrase, actualForFirstPhrase, "First Phrase");
        Test (expectedForSecondPhrase, actualForSecondPhrase, "Second Phrase");
        Test (expectedForThirdPhrase, actualForThirdPhrase, "Third Phrase");


    }

    private void Test(String expected, String actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + "test, has passed");
        } else {
            System.out.println(testName + "test, has failed");
        }
    }
}
