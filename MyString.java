/** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String strOut = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'A') && ((c <= 'Z'))) {
                c = (char) (c + 32);
                strOut = strOut + c;
            } else {
                strOut = strOut + c;
            }
        }
        return strOut;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            boolean check = true;
            for (int j = 0; j < str2.length(); j++) {
                if (i+j >= str1.length()){
                    return false;
                }
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                    check = false;

                    break;
                }

            }
            if (check) {
                return true;
            }

        }

        return false;
    }
}