package org.example.LLD.enums;

public class Booking {
    private BookingStatus status;

    public Booking() {
        this.status = BookingStatus.PENDING_PAYMENT;
    }

    public void confirm() {
        if(status != BookingStatus.PENDING_PAYMENT) {
            throw new IllegalStateException("Booking can not be confirmed in : " + status);
        }
        status = BookingStatus.CONFIRMED;
    }

    public void cancel() {
        if(!status.isCancellable()) {
            throw new IllegalStateException("Booking can not be cancelled in : " + status);
        }
        status = BookingStatus.CANCELLED;
    }

    public void complete() {
        if(status != BookingStatus.CONFIRMED) {
            throw new IllegalStateException("Booking can not be completed in : " + status);
        }
        status = BookingStatus.COMPLETED;
    }

    public BookingStatus getStatus() {
        return status;
    }
}
