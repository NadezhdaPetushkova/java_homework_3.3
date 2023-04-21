public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentOneYear + " рубля(ей)");

        int monthlyPaymentTwoYear = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentTwoYear + " рубля(ей)");

        int monthlyPaymentThreeYear = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платёж " + monthlyPaymentThreeYear + " рубля(ей)");
    }
}