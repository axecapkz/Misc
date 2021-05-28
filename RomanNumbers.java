public enum RomanNumbers {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5),
    VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10),
    XL("XL", 40), L("L", 50), XC("XC", 90), C("C", 100);


    private int value;
    private String key;


    RomanNumbers(String key, int value) {
        this.value = value;
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
}
