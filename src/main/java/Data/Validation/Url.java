package main.java.Data.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeremiah on 9/16/16.
 */
public class Url
{
    public static final Pattern VALID_URL_ADDRESS_REGEX =
            Pattern.compile("(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?");

    public static boolean validate( String emailStr )
    {
        Matcher matcher = VALID_URL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
