package  ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    int[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void TheAmountOfSalesTest() {
        StatsService SUMMA = new StatsService();
        int expected = 180;
        int actual = SUMMA.TheAmountOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesTest() {
        StatsService AVG = new StatsService();
        int expected = 15;
        int actual = AVG.AverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaximumSalesTest() {
        StatsService Max = new StatsService();
        int expected = 8;
        int actual = Max.MaximumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinimumSalesTest() {
        StatsService Min = new StatsService();
        int expected = 9;
        int actual = Min.MinimumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SmallerAverageSalesTest() {
        StatsService Smaller = new StatsService();
        int expected = 5;
        int actual = Smaller.SmallerAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void LargeAverageSales() {
        StatsService Larger = new StatsService();
        int expected = 5;
        int actual = Larger.LargeAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
