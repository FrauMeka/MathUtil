# MathUtil

MathUtil is a Java class that provides various static and non-static methods for advanced numerical operations, including prime checks, GCD/LCM calculations, Fibonacci numbers, factorials, and more.

## Features

### Static Methods

1. **isPrime(int n)**  
   Checks whether a given number `n` is prime.

2. **gcd(int a, int b)**  
   Calculates the greatest common divisor (GCD) of two integers.

3. **lcm(int a, int b)**  
   Computes the least common multiple (LCM) of two numbers.

4. **fibonacci(int n)**  
   Returns the nth Fibonacci number.

5. **factorial(int n)**  
   Calculates the factorial of a number `n`.

### Non-Static Methods

1. **isPerfectNumber(int n)**  
   Determines if the given number `n` is a perfect number.

2. **sumOfDigits(int n)**  
   Computes the sum of the digits of the given number `n`.

3. **reverseNumber(int n)**  
   Reverses the digits of a number `n`.

4. **isArmstrongNumber(int n)**  
   Checks if a number is an Armstrong number.

5. **nextPrime(int n)**  
   Finds the smallest prime number greater than `n`.

## Usage

To use the `MathUtil` class, simply call the static methods using the class name, and create an instance to access the non-static methods. Here’s an example of how to use it:

```java
public class Main {
    public static void main(String[] args) {
        // Static method usage
        System.out.println(MathUtil.isPrime(7)); // true
        
        // Non-static method usage
        MathUtil util = new MathUtil();
        System.out.println(util.isPerfectNumber(28)); // true
    }
}
