class PaypalProcessor implements PaymentProcessor {
    @Override
    public void allow() {
        System.out.println("Xác nhận thanh toán qua Paypal.");
    }

    @Override
    public void capture() {
        System.out.println("Chụp thanh toán từ Paypal.");
    }
}
