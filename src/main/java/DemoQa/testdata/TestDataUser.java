package DemoQa.testdata;

public class TestDataUser {
    private final static String DEFAULT_NAME = "John";
    private final static String LAST_NAME = "Doe";
    private final static String PHONE_NUMBER = "1231231231 ";

    public static User getDefaultUser() {
        User user = new User();
        user.setFirstName(DEFAULT_NAME);
        user.setLastName(LAST_NAME);
        user.setPhone(PHONE_NUMBER);
        return user;
    }

}
