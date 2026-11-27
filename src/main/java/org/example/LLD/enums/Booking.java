package org.example.LLD.enums;

public class Booking {
    private BookingStatus status;

    public Booking() {
        this.status = BookingStatus.PENDING_PAYMENT;
    }

    public void onPaymentSuccess() {
        status = BookingStatus.CONFIRMED;
    }
}
