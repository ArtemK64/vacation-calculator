package calculator.vacation;

import org.junit.jupiter.api.*;

class VacationPayTest {

    @Test
    void testCalcVacationPay() {
        VacationPay vacationPay = new VacationPay(14);
        Assertions.assertEquals(14000, vacationPay.calcVacationPay(vacationPay, 1000));
        Assertions.assertEquals(70000, vacationPay.calcVacationPay(vacationPay, 5000));
        Assertions.assertEquals(28000, vacationPay.calcVacationPay(vacationPay, 2000));
    }
}