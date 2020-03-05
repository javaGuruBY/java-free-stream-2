package by.serg;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest signComparatorTest = new SignComparatorTest();
        signComparatorTest.shouldReturnSignOfNumber();
    }
    public void shouldReturnSignOfNumber() {
        SignComparator comparator = new SignComparator();
        int number1 = 7;
        int number2 = -12;
        int number3 = 0;
        String expectedForNumber1 = "Number is positive";
        String expectedForNumber2 = "Number is negative";
        String expectedForNumber3 = "Number is equal to zero";
        String actualForNumber1 = comparator.compare(number1);
        String actualForNumber2 = comparator.compare(number2);
        String actualForNumber3 = comparator.compare(number3);
        assertThat(expectedForNumber1, actualForNumber1, "Test on positivity");
        assertThat(expectedForNumber2, actualForNumber2, "Test on negativity");
        assertThat(expectedForNumber3, actualForNumber3, "Test on zero");
    }
    private void assertThat (String expected, String actual, String testName) {
        if ( expected == actual ) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " has failed: \n expected = " + expected + ", but actual = " + actual);
        }
    }
}
