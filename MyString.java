public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); 
        System.out.println(contains("happy", "unhappy")); 
        System.out.println(contains("historical", "story")); 
        System.out.println(contains("psychology", "psycho")); 
        System.out.println(contains("personality", "son")); 
        System.out.println(contains("personality", "dad")); 
        System.out.println(contains("resignation", "sign")); 
    }

    public static String lowerCase(String str) {
        int len = str.length();
        char[] arr = new char[len]; 
        
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i); 

            if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char)(ch + ('a' - 'A')); 
            } else {
                arr[i] = ch;
            }
        }
        
        return new String(arr); 
    }

    public static boolean contains(String str1, String str2) {
        // המרה מפורשת ל-Lowercase באמצעות הפונקציה שיצרנו
        String lowerStr1 = lowerCase(str1);
        String lowerStr2 = lowerCase(str2);
        
        int N = lowerStr1.length(); 
        int M = lowerStr2.length(); 
        
        if (M > N) {
            return false;
        }
        
        for (int i = 0; i <= N - M; i++) {
            boolean isMatch = true; 
            
            for (int j = 0; j < M; j++) { 
                
                if (lowerStr1.charAt(i + j) != lowerStr2.charAt(j)) {
                    isMatch = false; 
                    break; 
                }
            }
            
            if (isMatch) {
                return true;
            }
        }
        
        return false;
    }
}