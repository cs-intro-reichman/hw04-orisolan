public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
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
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        int N = str1.length(); 
        int M = str2.length(); 
        
        if (M > N) {
            return false;
        }
        
        for (int i = 0; i <= N - M; i++) {
            
            boolean isMatch = true; 
            
            for (int j = 0; j < M; j++) { 
                
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    
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
