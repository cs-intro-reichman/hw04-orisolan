public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
        return false;
    }
    for (int i = 0; i < arr1.length; i++) {
        
        if (arr1[i] != arr2[i]) {
            return false; 
        }
    }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == ch) {
            return i; 
        }
    }
    return -1;  

    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
    for (int i = fromIndex; i < arr.length; i++) {
        
        if (arr[i] == ch) {    
            return i; 
        }
    } 
               return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == ch) {
            return i;
        }
    }

       return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        int newLength = arr1.length + arr2.length;
    char[] result = new char[newLength];
    
    for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i];
    }
    
    for (int j = 0; j < arr2.length; j++) {
        result[arr1.length + j] = arr2[j];
    }
    
    return result;
}

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
       int subLength = endIndex - beginIndex;
    char[] result = new char[subLength];
    
    for (int i = beginIndex; i < endIndex; i++) {
        int newIndex = i - beginIndex;
        result[newIndex] = arr[i];
    }
    
    return result;
}

    public static long hashCode(char[] arr) {
       if (arr.length == 0) {
        return 0;
    }

    long hash = 0;
    
    for (int i = 0; i < arr.length; i++) {
        hash = hash * 7 + arr[i];
    }
    
    return hash;
}

  public static int compareTo(String str1, String str2) {
    int len1 = str1.length();
    int len2 = str2.length();
    int minLength = Math.min(len1, len2);

    for (int i = 0; i < minLength; i++) {
        char c1 = str1.charAt(i);
        char c2 = str2.charAt(i);
        if (c1 != c2) {
            return c1 - c2; 
        }
    }
    return len1 - len2;
}

}
