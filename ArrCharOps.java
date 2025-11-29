public class ArrCharOps {

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /** Returns the char value at the specified index. Assume that the array is non-empty. */
    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    /** Returns true iff the two arrays are equal (same length & same chars). */
    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (charAt(arr1, i) != charAt(arr2, i)) return false;
        }
        return true;
    }

    /** Returns first index of character ch in arr, or -1 if not found. */
    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (charAt(arr, i) == ch) return i;
        }
        return -1;
    }

    /** Returns first index of character ch in arr starting from fromIndex. */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (charAt(arr, i) == ch) return i;
        }
        return -1;
    }

    /** Returns last index of character ch in arr, or -1 if not found. */
    public static int lastIndexOf(char[] arr, char ch) {
        if (arr == null || arr.length == 0) return -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (charAt(arr, i) == ch) return i;
        }
        return -1;
    }

    /** Returns concatenation of arr1 and arr2. */
    public static char[] concat(char[] arr1, char[] arr2) {
        char[] out = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) out[i] = charAt(arr1, i);
        for (int i = 0; i < arr2.length; i++) out[arr1.length + i] = charAt(arr2, i);
        return out;
    }

    /** Returns sub-array from beginIndex to endIndex-1. */
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] out = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            out[i - beginIndex] = charAt(arr, i);
        }
        return out;
    }

    /** Computes a hash code using base 7. */
    public static long hashCode(char[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            long factor = (long) Math.pow(7, arr.length - 1 - i);
            sum += arr[i] * factor;
        }
        return sum;
    }

    /**
     * Lexicographic compare:
     * return -1,0,1 or -2 if error.
     */
    public static int compareTo(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) return -2;
        if (str1.equals(str2)) return 0;

        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if (a != b) return (a < b ? -1 : 1);
        }

        return (str1.length() < str2.length() ? -1 :
                str1.length() > str2.length() ? 1 : 0); 
    }
}
