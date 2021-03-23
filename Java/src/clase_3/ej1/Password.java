package clase_3.ej1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String regex;
    private String password;

    public Password (final String regex) {
        this.regex = regex;
    }

    public void setValue (String password) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();

        if (matchFound) {
            this.password = password;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
