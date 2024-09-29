public class MathUtil {
    /**This method checks if n is prime by testing if it's divisible
     * by any number from 2 to its square root
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * This method finds the GCD of a and b by repeatedly replacing a with b and b
     * with a % b until b is zero, then returns the absolute value of a
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return Math.abs(a);
    }

    /**his method calculates the least common multiple (LCM) of a and b
     * by multiplying them and dividing by their greatest common divisor (GCD).
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     This method calculates the nth Fibonacci number using recursion, where it returns 0 if n is less than or equal to 0
     , 1 if n is 1, and otherwise the sum of the two preceding Fibonacci numbers.
     */
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     This method calculates the factorial of n recursively, throwing an exception if n is negative,
     returning 1 if n is 0, and otherwise multiplying n by the factorial of n - 1.
     */
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers are not allowed");
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    /**
     This method checks if a number n is perfect by summing
     all its divisors (up to n/2), and returns true if the sum equals n.
     */
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    /**
     This method calculates the sum of the digits of n by repeatedly adding the last digit (using n % 10)
     to sum and removing the last digit (using n /= 10) until n becomes 0.
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     This method reverses the digits of n by extracting each digit (using n % 10),
     appending it to reversed, and removing the last digit from n until n is 0.
     */
    public int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    /**
     This method checks if n is an Armstrong number by calculating the sum of its digits raised to the power
     of the total number of digits, and returns true if this sum equals the original number.
     */
    public boolean isArmstrongNumber(int n) {
        int num1 = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == num1;
    }

    /**
     This method finds the next prime number greater than n
     by incrementing a candidate number until it identifies one that is prime.
     */
    public int nextPrime(int n) {
        int num = n + 1;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

   public static void main(String[] args) {
    // Test cases for static methods
    System.out.println("Static Method Tests:");
    
    // Test isPrime
    System.out.println("isPrime(7): " + isPrime(7));    
    System.out.println("isPrime(10): " + isPrime(10));  
    System.out.println("isPrime(13): " + isPrime(13)); 

    // Test gcd
    System.out.println("gcd(24, 36): " + gcd(24, 36));   
    System.out.println("gcd(54, 24): " + gcd(54, 24));   
    System.out.println("gcd(100, 75): " + gcd(100, 75)); 

    // Test lcm
    System.out.println("lcm(24, 36): " + lcm(24, 36));   
    System.out.println("lcm(5, 10): " + lcm(5, 10));     
    System.out.println("lcm(12, 15): " + lcm(12, 15));   

    // Test fibonacci
    System.out.println("fibonacci(0): " + fibonacci(0));  
    System.out.println("fibonacci(1): " + fibonacci(1));   
    System.out.println("fibonacci(10): " + fibonacci(10));

    // Test factorial
    System.out.println("factorial(5): " + factorial(5));   
    System.out.println("factorial(0): " + factorial(0));   
    System.out.println("factorial(4): " + factorial(4));   

    // Test cases for non-static methods
    MathUtil util = new MathUtil();
    System.out.println("\nNon-Static Method Tests:");

    // Test isPerfectNumber
    System.out.println("isPerfectNumber(28): " + util.isPerfectNumber(28));   
    System.out.println("isPerfectNumber(6): " + util.isPerfectNumber(6));    
    System.out.println("isPerfectNumber(10): " + util.isPerfectNumber(10));   

    // Test sumOfDigits
    System.out.println("sumOfDigits(123): " + util.sumOfDigits(123));   
    System.out.println("sumOfDigits(456): " + util.sumOfDigits(456));  
    System.out.println("sumOfDigits(0): " + util.sumOfDigits(0));       

    // Test reverseNumber
    System.out.println("reverseNumber(12345): " + util.reverseNumber(12345)); 
    System.out.println("reverseNumber(100): " + util.reverseNumber(100));    
    System.out.println("reverseNumber(9876): " + util.reverseNumber(9876));   

    // Test isArmstrongNumber
    System.out.println("isArmstrongNumber(153): " + util.isArmstrongNumber(153)); 
    System.out.println("isArmstrongNumber(9474): " + util.isArmstrongNumber(9474)); 
    System.out.println("isArmstrongNumber(123): " + util.isArmstrongNumber(123)); 

    // Test nextPrime
    System.out.println("nextPrime(11): " + util.nextPrime(11));   
    System.out.println("nextPrime(14): " + util.nextPrime(14));   
    System.out.println("nextPrime(20): " + util.nextPrime(20));   
}
}
