package enums;

public enum Payments {
    CREDITCARD("card"),
    COINS("coins");

    private String value;

    Payments(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
