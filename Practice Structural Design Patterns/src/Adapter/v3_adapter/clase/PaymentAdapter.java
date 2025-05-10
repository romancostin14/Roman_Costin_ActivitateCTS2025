package Adapter.v3_adapter.clase;

public class PaymentAdapter implements PaymentProcessor{
private ThirdPartyPay thirdPartyPay;

    public PaymentAdapter(ThirdPartyPay thirdPartyPay) {
        this.thirdPartyPay = thirdPartyPay;
    }

    @Override
    public void processPayment(double amount) {
        thirdPartyPay.makeTransaction(amount);
    }
}
