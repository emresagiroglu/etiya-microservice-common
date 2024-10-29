package io.github.emresagiroglu.kafka.events.billingaccount;


public class BillingAccountCreatedEvent {

    private String customerId;
    private String accountNumber;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BillingAccountCreatedEvent(String customerId, String accountNumber) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
    }

    public BillingAccountCreatedEvent() {
    }
}
