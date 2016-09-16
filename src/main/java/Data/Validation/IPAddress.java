package main.java.Data.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeremiah on 9/16/16.
 */
public class IPAddress
{
    public static final Pattern IPADDRESS_PATTERN =
            Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");


    public static boolean validate( final String ip )
    {
        Matcher matcher = IPADDRESS_PATTERN.matcher(ip);
        return matcher.matches();
    }
}
