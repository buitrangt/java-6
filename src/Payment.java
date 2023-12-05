public class Payment {
    public static void main(String[] args) {

        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor paypalProcessor = new PaypalProcessor();


        PaymentService creditCardPaymentService = new PaymentService(creditCardProcessor);
        creditCardPaymentService.processPayment();


        PaymentService paypalPaymentService = new PaymentService(paypalProcessor);
        paypalPaymentService.processPayment();
    }
}
