package com.company;

// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes

public class exercise_4
{
    void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i = 0; i <= n; i++) {
            prime[i] = true;
            // System.out.println(prime[i]);
            // skaber 30 gange 'true' i array prime
        }

        for(int p = 2; pp <=n; p++) {
            // If prime[p] is not changed, then it is a prime
            // Ovenstående er sandt if-statement når p = 2,3,4,5.
            // Loop array af 2,3,4,5:
            if(prime[p] == true) {
                // Update all multiples of p
                System.out.println("p: " +p);
                for(int i = pp; i <= n; i += p) {
                    // i er (i + p) så:
                    // 0+2*2 = 4
                    // 4+2 = 6
                    // 6+2 = 8
                    //Fjerner alle 'tabellerne'.. 2,4,6,8 ... 3,6,9,12... etc.
                    prime[i] = false;
                    System.out.println("i: " + i + ". prime[i]: " + prime[i]);
                }
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }

    // Driver Program to test above function
    public static void main(String args[])
    {
        int n = 30;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        exercise_4 g = new exercise_4();
        g.sieveOfEratosthenes(n);
    }
}