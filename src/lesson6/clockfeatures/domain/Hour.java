package lesson6.clockfeatures.domain;

/**
 * Hour should represent a value between 0 and 24
 */
public class Hour {

    private byte hour;

    /**
     * Calls setHour method that validates the value when constructing the variable
     * @param hour - byte
     */
    public Hour(byte hour) {
        this.setHour(hour);
    }

    public Hour() {
    }

    public byte getHour() {
        return hour;
    }

    /**
     * Validation is in place
     * byte values between 0 and 24 are allowed
     * @param hour - byte
     */
    public void setHour(byte hour) {

        if (hour < 0) {
            // throw an error "Number is too small"
            return;
        } else if (hour > 24) {
            // throw an error "Number is too large"
            return;
        }

        this.hour = hour;
    }
}
