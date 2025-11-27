public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /**
     * Returns the char value at the specified index. Assume that the array is
     * non-empty.
     */
    public static char charAt(char[] arr, int index) {
        // Replace the following statement with your code

        return arr[index];
    }

    /**
     * If the two arrays have the same value in every index,
     * returns true; Otherwise returns false.
     */
    public static boolean equals(char[] arr1, char[] arr2) {
        // Replace the following statement with your code
        int i = 0;
        if (arr1.length != arr2.length) {
            return false;
        }
        while (i < arr2.length) {
            if (charAt(arr1, i) != charAt(arr2, i)) {
                return false;
            }
            i++;

        }
        return true;
    }

    /**
     * Returns the index within the given array of the first occurrence of the given
     * character.
     * If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        // Replace the following statement with your code
        for (int i = 0; i < arr.length; i++) {
            if (ch == charAt(arr, i)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Same as indexOf(char[], char), but starts the search in the given index.
     */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        // Replace the following statement with your code
        for (int i = fromIndex; i < arr.length; i++) {
            if (ch == charAt(arr, i)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index within the given arr of the last occurrence of the given
     * character.
     * If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        // Replace the following statement with your code
        if (arr == null) {
            return -1;
        }
        if (arr.length == 0) {
            return -1;
        }
        int i = arr.length - 1;
        while (i >= 0) {
            if (ch == charAt(arr, i)) {
                return i;
            } else {
                i = i - 1;
            }
        }
        return -1;
    }

    /*
     * Returns an array which is the concatanation of the two given arrays.
     */
    public static char[] concat(char[] arr1, char[] arr2) {
        // Replace the following statement with your code
        char[] arr3 = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            char ch = charAt(arr1, i);
            arr3[i] = ch;
        }
        for (int i = 0; i < arr2.length; i++) {
            char ch = charAt(arr2, i);
            arr3[arr1.length + i] = ch;
        }

        return arr3;
    }

    /**
     * Returns a new array that can be described as a sub-array of this array.
     * The sub-array begins at the specified beginIndex and extends to the character
     * at index endIndex - 1.
     * For example, if arr contains the characters "hamburger", then subArray(4, 8)
     * returns an array of
     * characters containing the characters "urge".
     */
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] arr3 = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            char ch = charAt(arr, i);
            arr3[i - beginIndex] = ch;

        }
        // Replace the following statement with your code
        return arr3;
    }

    /**
     * Returns a single integer that represents the given array. This integer is
     * sometimes
     * referred to as the array's "hash code". Later in the course we'll explain
     * what these
     * hash codes are used for. For now, simply implement the specification given
     * below.
     * The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... +
     * arr[n-2]*7 + arr[n-1]
     * where arr[i] is the i'th character of the array, and n is the array's length.
     * The hash value of an empty array is zero.
     */
    public static long hashCode(char[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int y = charAt(arr, i);
            y = (int) (y * (Math.pow(7, arr.length - i - 1)));
            sum += y;
        }
        // Replace the following statement with your code
        return sum;
    }

    /**
     * Compares the two strings lexicographically.
     * Assume that both strings are not empty.
     * 
     * Characters are compared one by one from left to right, using their numeric
     * Unicode values,
     * as follows:
     * 1. If two characters at the same position in both strings are different,
     * the string with the smaller character is considered lexicographically
     * smaller.
     * 2. If all characters in the shorter string match the corresponding characters
     * in the longer string, the shorter string is considered lexicographically
     * smaller.
     * 3. If both strings have the same characters and the same length, they are
     * considered equal.
     * 
     * Examples:
     * - "apple" is less than "banana" because 'a' comes before 'b'.
     * - "abc" is less than "abcd" because it is shorter.
     * - "hello" is equal to "hello".
     * - "date" is greater than "dark" because 't' comes after 'k'.
     * 
     * @param str1 the first string to compare
     * @param str2 the second string to compare
     * @return -1 if str1 is lexicographically less than str2,
     *         zero if they are equal, and 1 if str1 is
     *         lexicographically greater than str2.
     *         return -2 if there is an error with the input.
     */
    public static int compareTo(String str1, String str2) {
        // Replace the following statement with your code
        if (str1.length() == 0 || str2.length() == 0) {
            return -2;
        }

        if (str1.equals(str2)) {
            return 0;
        }
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if (a != b) {
                if (a < b) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (str1.length() < str2.length()) {
            return -1;
        }
        if (str1.length() > str2.length()) {
            return 1;
        }

        return 0;
    }
