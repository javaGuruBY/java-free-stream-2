package by.serg;

public class ColorDetectorTest {
    public static void main(String[] args) {
        ColorDetectorTest colorDetectorTest = new ColorDetectorTest();
        colorDetectorTest.shouldCheckIsColorRightOrNot();
    }

    public void shouldCheckIsColorRightOrNot() {
        ColorDetector colorDetector = new ColorDetector();
        int testWaveLength = 400;
        String expectedAnswer = "Violet";
        String actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on violet color");
        testWaveLength = 470;
        expectedAnswer = "Blue";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on blue color");
        testWaveLength = 510;
        expectedAnswer = "Green";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on green color");
        testWaveLength = 580;
        expectedAnswer = "Yellow";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on yellow color");
        testWaveLength = 600;
        expectedAnswer = "Orange";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on orange color");
        testWaveLength = 700;
        expectedAnswer = "Red";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on red color");
        testWaveLength = 200;
        expectedAnswer = "Invisible Light";
        actualAnswer = colorDetector.detect(testWaveLength);
        assertThat(expectedAnswer, actualAnswer, "Test on invisible light");
    }

    private void assertThat(String expected, String actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " has failed: \n expected = " + expected + ", but actual = " + actual);
        }
    }
}
