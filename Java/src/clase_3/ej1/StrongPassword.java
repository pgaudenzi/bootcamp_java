package clase_3.ej1;

public class StrongPassword extends Password {

    private static final String STRONG_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{6,12}$";

    public StrongPassword() {
        super(STRONG_REGEX);
    }

    @Override
    public void setValue(String password) {
        try {
            super.setValue(password);
        } catch (IllegalArgumentException e) {
            System.out.println("It must include at least one uppercase, one special character, one number and " +
                    "has between 6 and 12 characters long");
        }
    }
}
