package src.Java;

/*
* Instructions
In this exercise, you'll be implementing rules for calculating the total salary of a employee in a month.
*  The International Siderurgy Company (ISC) needs help to calculate the salary for the employees,
*   given that different factors can alter the final wage value for each employee.

You have three tasks and you should use the ternary operator instead of if/else statements to implement them.
* */

public class SalaryCalculator {
    /*
    * Implement the multiplierPerDaysSkipped method that returns the salary multiplier based on the number of days the employee skipped the job.
    * A 15% penalty is applied if more than five days were skipped.
    * */

    public static double multiplierPerDaysSkipped(int daysSkipped) {
        final double MULTIPLIER_SKIPPED = 0.85;
        final double MULTIPLIER = 1; //Porcentaje inicial
        if(daysSkipped < 5){ //Si no ha hecho 5 no se afecta
            return MULTIPLIER;
        }else{ //Si +5, 0.85
            return MULTIPLIER_SKIPPED;
        }
    }

    /*
    * Implement the multiplierPerProductsSold and bonusForProductSold methods.
    * The ISC pays ten monetary units for each product sold, but if the employee sold more than twenty products,
    *    the multiplier is improved to thirteen.
    *  multiplierPerProductsSold should decide which multiplier is applied and bonusForProductSold should return the total bonus in monetary units.
    * */
    public static int multiplierPerProductsSold(int productsSold) {
        final int MULTIPLIER_20 = 13;
        final int MULTIPLIER = 10;
        if(productsSold > 20){
            return MULTIPLIER_20;
        }else{
            return MULTIPLIER;
        }
    }

    public static double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    /*
    * Implement the finalSalary method.
    * It should be able to multiply the base salary of 1000.00 by the salary multiplier
    * and sum the bonus and return the result, but keep in mind that salaries should be capped at 2000.00;
    * */

    public static double finalSalary(int daysSkipped, int productsSold) {
        final double SALARY = 1000.00;
        final double SALARY_CAPPED = 2000.00;
        if(((multiplierPerDaysSkipped(daysSkipped) * SALARY) + bonusForProductSold(productsSold)) > SALARY_CAPPED){
            return SALARY_CAPPED;
        }else{
            return ((multiplierPerDaysSkipped(daysSkipped) * SALARY) + bonusForProductSold(productsSold));
        }
    }

    public static void main(String[] args) {
        //TEST
        System.out.println("Multiplier Per Day Skipped: " + multiplierPerDaysSkipped(10));
        System.out.println("Multiplier Per Product Sold: " + multiplierPerProductsSold(21));
        System.out.println("Bonus For Product Sold: " + bonusForProductSold(5));
        System.out.println("Final Salary: " + finalSalary(2,3));
        System.out.println("Final Salary: " + finalSalary(10,2));
    }
}
