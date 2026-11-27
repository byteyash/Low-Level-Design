package org.example.LLD.enums;

public enum BookingStatus {
    PENDING_PAYMENT("Payment Confirmed"),
    CONFIRMED("Confirmed"),
    CANCELLED("Cancelled"),
    COMPLETED("Completed");

    private final String label;
    BookingStatus(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}
