package by.serg;

public class StockTest {
    public static void main(String[] args) {
        StockTest testing = new StockTest();
        testing.shouldReturnPrices();
    }

    public void shouldReturnPrices() {
        Stock apple = new Stock("Apple", 100);
        String expectedStockInformation = "Company name = Apple, current price = 100.0 $, maximum price = 100.0 $, minimal price = 100.0 $";
        String actualStockInformation = apple.printInformation();
        assertThat(expectedStockInformation, actualStockInformation, "Test 1, Actual price 100");

        apple.updatePrice(70);
        expectedStockInformation = "Company name = Apple, current price = 70.0 $, maximum price = 100.0 $, minimal price = 70.0 $";
        actualStockInformation = apple.printInformation();
        assertThat(expectedStockInformation, actualStockInformation, "Test 2, Actual price 70");

        apple.updatePrice(150);
        expectedStockInformation = "Company name = Apple, current price = 150.0 $, maximum price = 150.0 $, minimal price = 70.0 $";
        actualStockInformation = apple.printInformation();
        assertThat(expectedStockInformation, actualStockInformation, "Test 3, Actual price 150");
    }

    private void assertThat(String expectedStockInformation, String actualStockInformation, String testName) {
        if (expectedStockInformation.equals(actualStockInformation)) {
            System.out.println("Test " + testName + " has passed");
        } else {
            System.out.println("Test " + testName + " has failed");
        }
    }
}