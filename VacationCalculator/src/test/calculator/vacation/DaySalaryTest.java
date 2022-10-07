package calculator.vacation;

import org.testng.Assert;
import org.junit.jupiter.api.*;

class DaySalaryTest {

    @Test
    void testCountWeekends() {
        DaySalary daySalary = new DaySalary(2022, 360000);
        Assert.assertEquals(105, daySalary.countWeekends(daySalary));

        DaySalary newDaySalary = new DaySalary(2021, 360000);
        Assert.assertEquals(104, newDaySalary.countWeekends(newDaySalary));
    }

    @Test
    void testCalcDaySalary() {
        DaySalary newDaySalary = new DaySalary(2020, 360000);
        Assert.assertEquals(1374, newDaySalary.calcDaySalary(newDaySalary));
    }
}