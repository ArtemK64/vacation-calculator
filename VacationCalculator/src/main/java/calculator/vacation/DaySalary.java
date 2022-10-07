package calculator.vacation;

import lombok.Data;

import java.time.Year;
import java.util.*;

@Data
public class DaySalary { // count "salary" which employee get each day when he/she works (except weekends)
    private int year;
    private int yearSalary;

    DaySalary(int year, int yearSalary) {
        this.year = year;
        this.yearSalary = yearSalary;

        if (yearSalary < 0 || year < 0) {
            throw new IllegalArgumentException("Your wrote incorrect input value");
        }
    }

    public final int countWeekends(DaySalary daySalary) { // counting all weekends (saturdays and sundays)
        Calendar firstYearDay = Calendar.getInstance();
        firstYearDay.set(daySalary.year, Calendar.JANUARY, 1);

        Calendar lastYearDay = Calendar.getInstance();
        lastYearDay.set(daySalary.year, Calendar.DECEMBER, 31);

        int count = 0;
        while (firstYearDay.before(lastYearDay)) {
            switch (firstYearDay.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.SUNDAY, Calendar.SATURDAY -> {
                    count++;
                    firstYearDay.add(Calendar.DATE, 1);
                }
                default -> firstYearDay.add(Calendar.DATE, 1);
            }
        }
        return count;
    }

    public final int calcDaySalary(DaySalary daySalary) {
        return daySalary.yearSalary / (Year.of(daySalary.year).length() - countWeekends(daySalary));
    }
}