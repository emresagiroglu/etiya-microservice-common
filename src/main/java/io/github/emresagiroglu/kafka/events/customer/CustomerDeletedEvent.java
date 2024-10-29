package io.github.emresagiroglu.kafka.events.customer;

import java.time.LocalDateTime;

public class CustomerDeletedEvent {
    private String id;
    private LocalDateTime deletedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public CustomerDeletedEvent() {
    }

    public CustomerDeletedEvent(String id, LocalDateTime deletedDate) {
        this.id = id;
        this.deletedDate = deletedDate;
    }
}
