//Largest prime factor
//Problem 3
//----------

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

//Solution
//----------

public class Test {
    public static void main(String[] args) {
        long num = 600851475143L, max = 3;
        for ( long i = 3 ; i <= num ; i++ )
        {
            if (isPrime(i)){
                if (num%i == 0){
                    num = num/i;
                    if (i>max){
                        max = i;
                    }
                }
            }
        }
        System.out.println(max);
    }
    //to only test odd prime numbers
    public static boolean isPrime(long n){
        for(long i = 3; i<n; i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
}
