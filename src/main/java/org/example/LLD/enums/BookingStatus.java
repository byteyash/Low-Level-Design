package org.example.LLD.enums;

public enum BookingStatus {
    PENDING_PAYMENT("Payment Pending", true),
    CONFIRMED("Confirmed", true),
    CANCELLED("Cancelled", false),
    COMPLETED("Completed", false);

    private final String label;
    private final boolean cancellable;

    BookingStatus(String label, boolean cancellable) {
        this.label = label;
        this.cancellable = cancellable;
    }

    public String getLabel() {
        return label;
    }

    public boolean isCancellable() {
        return cancellable;
    }

    public boolean isTerminal() {
        return this == COMPLETED || this == CANCELLED;
    }
}
