package Adapter.v3_adapter.program;

import Adapter.v3_adapter.clase.PaymentAdapter;
import Adapter.v3_adapter.clase.ThirdPartyPay;

public class Program {
    public static void main(String[] args) {
        ThirdPartyPay thirdPartyPay = new ThirdPartyPay();
        PaymentAdapter paymentAdapter = new PaymentAdapter(thirdPartyPay);
        paymentAdapter.processPayment(500);
    }
}
