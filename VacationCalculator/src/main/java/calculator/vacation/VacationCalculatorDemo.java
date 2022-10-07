package calculator.vacation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VacationCalculatorDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        VacationPay vacationPay = context.getBean("vacationPayBean", VacationPay.class);
        DaySalary daySalary = context.getBean("daySalaryBean", DaySalary.class);

        System.out.println("Input values" +
                "\nAmount of your vacation days: " + vacationPay.getQtyOfDaysVacation() +
                "\nYear: " + daySalary.getYear() +
                "\nYear salary: " + daySalary.getYearSalary()
        );

        int salary = daySalary.calcDaySalary(daySalary);

        System.out.println("\nDay salary: " + salary);
        System.out.println("Total vacation pay: " + vacationPay.calcVacationPay(vacationPay, salary));

        context.close();
    }
}