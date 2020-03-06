package by.nlukash;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest signComparatorTest=new SignComparatorTest();
        signComparatorTest.shouldReturnSignOfNumber();
    }
    public void shouldReturnSignOfNumber(){
        SignComparator comparator=new SignComparator();
        int NumberOne=5;
        int NumberTwo=-5;
        int NumberThree=0;
        String expectedResultForFirstNumber="Number is positive";
        String expectedResultForSecondNumber="Number is negative";
        String expectedResultForThridNumber="Number is equal zero";
        String actualResultForFirstNumber=comparator.compare(NumberOne);
        String actualResultForSecondNumber=comparator.compare(NumberTwo);
        String actualResultForThridNumber=comparator.compare(NumberThree);
        checkThat(expectedResultForFirstNumber,actualResultForFirstNumber,"Number is positive");
        checkThat(expectedResultForSecondNumber,actualResultForSecondNumber,"Number is negative");
        checkThat(expectedResultForThridNumber,actualResultForThridNumber,"Number is equal zero");

    }
    public void checkThat(String expected,String actual,String testName){
        if(expected==actual){
            System.out.println(testName+" has been passed!");
        }else {
            System.out.println(testName + " has been failed!");

        }

    }
}

