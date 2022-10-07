package calculator.vacation;

import lombok.Data;

@Data
public class VacationPay { // we assume that employee have only one vacation each year
    private int qtyOfDaysVacation;

    VacationPay(int qtyOfDaysVacation) {
        this.qtyOfDaysVacation = qtyOfDaysVacation;

        if (qtyOfDaysVacation < 0) {
            throw new IllegalArgumentException("You wrote incorrect value");
        }
    }

    public final int calcVacationPay(VacationPay vacationPay, int daySalary) {
        return vacationPay.qtyOfDaysVacation * daySalary;
    }
}