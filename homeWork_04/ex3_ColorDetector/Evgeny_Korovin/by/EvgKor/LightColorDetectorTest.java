package by.EvgKor;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest=new LightColorDetectorTest();
        lightColorDetectorTest.returnRightColor();

    }
    public void returnRightColor(){
        LightColorDetector detector=new LightColorDetector();
        int colorNum1=440;
        int colorNum2=469;
        int colorNum3=569;
        int colorNum4=580;
        int colorNum5=600;
        int colorNum6=750;
        String expectedResultForColorNum1="Violet";
        String expectedResultForColorNum2="Blue";
        String expectedResultForColorNum3="Green";
        String expectedResultForColorNum4="Yellow";
        String expectedResultForColorNum5="Orange";
        String expectedResultForColorNum6="Red";
        String actualResultForColorNum1=detector.detect(colorNum1);
        String actualResultForColorNum2=detector.detect(colorNum2);
        String actualResultForColorNum3=detector.detect(colorNum3);
        String actualResultForColorNum4=detector.detect(colorNum4);
        String actualResultForColorNum5=detector.detect(colorNum5);
        String actualResultForColorNum6=detector.detect(colorNum6);
        checkResult(expectedResultForColorNum1,actualResultForColorNum1,"Violet");
        checkResult(expectedResultForColorNum2,actualResultForColorNum2,"Blue");
        checkResult(expectedResultForColorNum3,actualResultForColorNum3,"Green");
        checkResult(expectedResultForColorNum4,actualResultForColorNum4,"Yellow");
        checkResult(expectedResultForColorNum5,actualResultForColorNum5,"Orange");
        checkResult(expectedResultForColorNum6,actualResultForColorNum6,"Red");


    }
    public void checkResult(String expected,String actual,String textColor){
        if(expected==actual){
            System.out.println(textColor+" has been passed!");
        }
        else {
            System.out.println(textColor+" has been failed!");
            System.out.println("Expected "+expected+" but actual "+actual);
        }
    }
}
