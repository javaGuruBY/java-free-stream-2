public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.returnRightColor();
    }

    public void returnRightColor() {

        LightColorDetector detector = new LightColorDetector();
        int colorNum1 = 400;
        int colorNum2 = 470;
        int colorNum3 = 500;
        int colorNum4 = 580;
        int colorNum5 = 600;
        int colorNum6 = 635;
        int colorNum7 = 900;
        String actualResultForColorNum1 = detector.detect(colorNum1);
        String actualResultForColorNum2 = detector.detect(colorNum2);
        String actualResultForColorNum3 = detector.detect(colorNum3);
        String actualResultForColorNum4 = detector.detect(colorNum4);
        String actualResultForColorNum5 = detector.detect(colorNum5);
        String actualResultForColorNum6 = detector.detect(colorNum6);
        String actualResultForColorNum7 = detector.detect(colorNum7);
        String expectedResultForColorNum1="Violet";
        String expectedResultForColorNum2="Blue";
        String expectedResultForColorNum3="Green";
        String expectedResultForColorNum4="Yellow";
        String expectedResultForColorNum5="Orange";
        String expectedResultForColorNum6="Red";
        String expectedResultForColorNum7="Invisible light";
        checkTest(actualResultForColorNum1, expectedResultForColorNum1, "Test 1 Violet");
        checkTest(actualResultForColorNum2, expectedResultForColorNum2, "Test 2 Blue");
        checkTest(actualResultForColorNum3, expectedResultForColorNum3, "Test 3 Green");
        checkTest(actualResultForColorNum4, expectedResultForColorNum4, "Test 4 Yellow");
        checkTest(actualResultForColorNum5, expectedResultForColorNum5, "Test 5 Orange");
        checkTest(actualResultForColorNum6, expectedResultForColorNum6, "Test 6 Red");
        checkTest(actualResultForColorNum7, expectedResultForColorNum7, "Test 7 Invisible light");
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
