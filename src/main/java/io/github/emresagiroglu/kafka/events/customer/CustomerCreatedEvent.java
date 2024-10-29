package io.github.emresagiroglu.kafka.events.customer;


public class CustomerCreatedEvent {
    private String nationalityId;
    private String id;
    private String accountNumber;
    private String mobilePhone;
    private String firstName;
    private String middleName;
    private String lastName;
    private String orderNumber;

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public CustomerCreatedEvent() {
    }

    public CustomerCreatedEvent(String nationalityId, String id, String accountNumber, String mobilePhone, String firstName, String middleName, String lastName, String orderNumber) {
        this.nationalityId = nationalityId;
        this.id = id;
        this.accountNumber = accountNumber;
        this.mobilePhone = mobilePhone;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.orderNumber = orderNumber;
    }
}
