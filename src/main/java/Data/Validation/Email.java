package main.java.Data.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeremiah on 9/16/16.
 */
public class Email
{
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate( String emailStr )
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
