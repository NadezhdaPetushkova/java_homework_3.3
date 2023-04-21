public class CreditPaymentService {
    public int calculate(int totalCredit, int years, double percentCredit) {
        double monthlyPercent = percentCredit / (12 * 100);
        double month = years * 12;
        double monthlyPayment = totalCredit * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -month));
        return (int) monthlyPayment;
    }
}
