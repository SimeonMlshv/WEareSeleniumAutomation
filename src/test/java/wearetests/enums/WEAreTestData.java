package wearetests.enums;

public enum WEAreTestData {
    STANDARD_USER_USERNAME("adminsimeon"),
    STANDARD_USER_PASSWORD("Test123456"),
    NEW_POST_MESSAGE("This is a new post"),
    NEW_POST_TITLE("Amazing Post");

    private final String value;

    WEAreTestData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

