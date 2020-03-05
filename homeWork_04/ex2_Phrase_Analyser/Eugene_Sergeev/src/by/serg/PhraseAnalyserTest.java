package by.serg;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.shouldReturnOneOfThreeAnswers();
    }

    public void shouldReturnOneOfThreeAnswers() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String phrase1 = "Make America great again";
        String phrase2 = "Make Russia great at least once";
        String phrase3 = "This test should pass great again";
        String phrase4 = "Did it?";
        String expectedForPhrase1 = "It stands no chance";
        String expectedForPhrase2 = "It could be worse";
        String expectedForPhrase3 = "It could be worse";
        String expectedForPhrase4 = "It is fine, really";
        String actualForPhrase1 = phraseAnalyser.analyse(phrase1);
        String actualForPhrase2 = phraseAnalyser.analyse(phrase2);
        String actualForPhrase3 = phraseAnalyser.analyse(phrase3);
        String actualForPhrase4 = phraseAnalyser.analyse(phrase4);
        assertThat(expectedForPhrase1, actualForPhrase1, "Test on line \"It stands no chance\"");
        assertThat(expectedForPhrase2, actualForPhrase2, "Test on line \"It could be worse\"");
        assertThat(expectedForPhrase3, actualForPhrase3, "Test on line \"It could be worse\" again");
        assertThat(expectedForPhrase4, actualForPhrase4, "Test on line \"It is fine, really\"");
    }

    private void assertThat(String expected, String actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " has failed: \n expected = " + expected + ", but actual = " + actual);
        }
    }
}
