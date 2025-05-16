import java.util.*;
public class primeinRange {

    // Function to check if a given number is prime or not
    public static boolean isprime(int n){
        if(n == 2){
            return true;  // if given number is 2 then it is prime
        }
        
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n % i == 0){ 
                    return false ; // not prime if divisible
            }
        }
        return true ; // prime if no divisors found
    }

    // Function to print all prime numbers up to n
    public static void  priminrange(int n){
        for(int i = 2 ; i<=n ; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    //main function 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int checknum = sc.nextInt(); // Take input from user
        
        priminrange(checknum); // Print primes up to input number

        sc.close(); // close the scanner
    }
  }
