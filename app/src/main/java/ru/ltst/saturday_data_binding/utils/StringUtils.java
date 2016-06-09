package ru.ltst.saturday_data_binding.utils;

public class StringUtils {

    public static String camelString(String string) {
        if (string == null) {
            return null;
        }
        boolean upperCase = false;
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < string.length(); x++) {
            char itemChar = string.charAt(x);
            String itemString = Character.toString(itemChar);
            if (itemString.equals(" ")) {
                continue;
            }
            if (upperCase) {
                itemString = itemString.toUpperCase();
            }
            upperCase = !upperCase;
            builder.append(itemString);
        }
        return builder.toString();
    }
}
