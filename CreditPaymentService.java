public class CreditPaymentService {
    public double calculate(double sum, double percent, int period) {
        double payment = 0;
        double monthlyRate = 0;
        double ratio = 0;
        monthlyRate = percent / 12 / 100;
        ratio = (monthlyRate * (double) Math.pow((1 + monthlyRate), period)) / ((double) Math.pow((1 + monthlyRate), period) - 1);
        payment = sum * ratio;
        return payment;
    }
}
