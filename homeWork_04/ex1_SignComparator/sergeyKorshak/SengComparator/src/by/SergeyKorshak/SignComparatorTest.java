package by.SergeyKorshak;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparatorTest signComparatorTest = new SignComparatorTest();
        signComparatorTest.shouldReturnSignOfNumber();

    }

    public void shouldReturnSignOfNumber() {
        SignComparator comparator = new SignComparator();
        int numberOne = 189;
        int numberTwo = -15;
        int numberThree = 0;
        String actualResultNumberOne = comparator.compare(numberOne);
        String actualResultNumberTwo = comparator.compare(numberTwo);
        String actualResultNumberThree = comparator.compare(numberThree);

        String expectedResultNumberOne = "Number is positive";
        String expectedResultNumberTwo = "Number is negative";
        String expectedResultNumberThree = "Number is equal to zero";
        checkTest(actualResultNumberOne, expectedResultNumberOne, "Test 1 Number is positive");
        checkTest(actualResultNumberTwo, expectedResultNumberTwo, "Test 2 Number is negative");
        checkTest(actualResultNumberThree, expectedResultNumberThree, "Test 3 Number is equal to zero");
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
