package pl.altkom.maven;

import pl.altkom.utils.HelloUtil;

public class UpperCase {

    public static final String GREETING_UPPER = "HELLO";

    public static String convertToUpper(String name) {
        String upperName = HelloUtil.hello(name);
        return upperName.toUpperCase();
    }
}