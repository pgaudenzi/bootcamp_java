package clase_3.ej1;

public class IntermediatePassword extends Password {

    private static final String INTERMEDIATE_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\S{6,12}$";

    public IntermediatePassword() {
        super(INTERMEDIATE_REGEX);
    }

    @Override
    public void setValue(String password) {
        try {
            super.setValue(password);
        } catch (IllegalArgumentException e) {
            System.out.println("It must include at least one uppercase, one special character and one number");
        }
    }
}
