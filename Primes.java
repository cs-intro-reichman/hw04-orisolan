public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        if (n <= 1) {
            System.out.println("Prime numbers up to " + n + ":");
            System.out.println("There are 0 primes between 2 and " + n + " (0% are primes)");
            return; 
        }

        boolean[] isPrime = new boolean[n + 1]; 
        
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        int p = 2; 
        
        while (p * p <= n) { 
            
            if (isPrime[p]) { 
                
                for (int i = p * p; i <= n; i = i + p) {
                    isPrime[i] = false;
                }
            }
            p++; 
        }
        
        int count = 0; 
        
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2 ; i <= n; i++) {
            
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        
        
        double percentage = ( (double)count / (n - 1) ) * 100;

        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)percentage + "% are primes)");
    }
}
