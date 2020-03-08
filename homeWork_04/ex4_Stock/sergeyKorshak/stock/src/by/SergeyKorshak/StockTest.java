package by.SergeyKorshak;

public class StockTest {
    public static void main(String[] args) {
        StockTest intelTest = new StockTest();
        intelTest.shouldReturnPrices();
    }

    public void shouldReturnPrices() {
        Stock intel = new Stock("Intel", 25.23);
        String actualStockInformation1 = intel.printInformation();
        String expectedStockInformation1 = "Company = Intel, Current Price = 25.23, Min Price = 25.23, Max Price = 25.23";
        checkTest(actualStockInformation1, expectedStockInformation1, "Test 1 - CurrentPrice = 25.23");

        intel.updatePrice(100.0);
        String actualStockInformation2 = intel.printInformation();
        String expectedStockInformation2 = "Company = Intel, Current Price = 100.0, Min Price = 25.23, Max Price = 100.0";
        checkTest(actualStockInformation2, expectedStockInformation2, "Test 2  - CurrentPrice = 100.0");

        intel.updatePrice(50.0);
        String actualStockInformation3 = intel.printInformation();
        String expectedStockInformation3 = "Company = Intel, Current Price = 50.0, Min Price = 25.23, Max Price = 100.0";
        checkTest(actualStockInformation3, expectedStockInformation3, "Test 3  - CurrentPrice = 50.0");
    }

    public void checkTest(String actual, String expected, String testName) {
        if (expected.equals(actual))
            System.out.println(testName + ", has been passed!");
        else
            System.out.println(testName + ", has been failed!");
    }

}
