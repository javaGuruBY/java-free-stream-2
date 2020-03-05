package by.EvgKor;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest signComparatorTest=new SignComparatorTest();
        signComparatorTest.shouldReturnSignOfNumber();
    }
    public void shouldReturnSignOfNumber(){
        SignComparator comparator=new SignComparator();
        int NumberOne=45;
        int NumberTwo=-8;
        int NumberThree=0;
        String expectedResultForNumberOne="Number is positive";
        String expectedResultForNumberTwo="Number is negative";
        String expectedResultForNumberThree="Number is equal zero";
        String actualResultForNumberOne=comparator.compare(NumberOne);
        String actualResultForNumberTwo=comparator.compare(NumberTwo);
        String actualResultForNumberThree=comparator.compare(NumberThree);
        checkThat(expectedResultForNumberOne,actualResultForNumberOne,"Number is positive");
        checkThat(expectedResultForNumberTwo,actualResultForNumberTwo,"Number is negative");
        checkThat(expectedResultForNumberThree,actualResultForNumberThree,"Number is equal zero");

    }
    public void checkThat(String expected,String actual,String testName){
        if(expected==actual){
            System.out.println(testName+" has been passed!");
        }else {
            System.out.println(testName + " has been failed!");
            System.out.println("Expected " + expected + " but actual" + actual);
        }

    }
}
