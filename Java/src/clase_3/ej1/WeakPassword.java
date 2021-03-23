package clase_3.ej1;

public class WeakPassword extends Password {

    private static final String WEAK_REGEX = "[a-z]";

    public WeakPassword() {
        super(WEAK_REGEX);
    }

}
