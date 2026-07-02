class Investment {

    private double principal;
    private double annualGrowth;

    Investment(double principal, double annualGrowth) {
        this.principal = principal;
        this.annualGrowth = annualGrowth;
    }

    // Recursive method to estimate future value
    public double forecast(int years) {

        if (years == 0) {
            return principal;
        }

        return calculate(principal, years);
    }

    private double calculate(double amount, int yearsLeft) {

        if (yearsLeft == 0) {
            return amount;
        }

        double nextAmount = amount + (amount * annualGrowth);

        return calculate(nextAmount, yearsLeft - 1);
    }
}

public class FinancialForecast {

    public static void main(String[] args) {

        Investment investment = new Investment(10000, 0.10);

        int duration = 5;

        double futureAmount = investment.forecast(duration);

        System.out.println("Initial Investment : ₹10000.00");
        System.out.println("Annual Growth Rate : 10%");
        System.out.println("Investment Period : " + duration + " years");
        System.out.printf("Estimated Future Value : ₹%.2f%n", futureAmount);
    }
}
