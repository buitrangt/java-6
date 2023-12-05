class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void allow() {
        System.out.println("Xác nhận thanh toán qua thẻ tín dụng.");
    }

    @Override
    public void capture() {
        System.out.println("Chụp thanh toán từ thẻ tín dụng.");
    }
}
