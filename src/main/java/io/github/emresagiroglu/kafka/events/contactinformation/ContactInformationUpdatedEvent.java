package io.github.emresagiroglu.kafka.events.contactinformation;


public class ContactInformationUpdatedEvent {
    private String id;
    private String mobilePhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public ContactInformationUpdatedEvent(String id, String mobilePhone) {
        this.id = id;
        this.mobilePhone = mobilePhone;
    }

    public ContactInformationUpdatedEvent() {
    }
}
