/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  5) sumN            - uses a while loop to find the sum of the first n integers. 
 *
 *  6) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  7) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 *  8) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 *  9) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 10) divBy5or7Sum    - uses a while loop to find the sum of all values in the
 *                   set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 11) bizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *               printed, and if the number is divisible by 5, "buzz" should
 *           be printed. Sample output:
 *
 *           1, 2, Bizz, 4, Buzz, Bizz, 7, 8, Bizz, Buzz, 11, Bizz, 13, 14, 
 *                       Bizz Buzz, 16, 17, Bizz, 19, Buzz, Bizz, 22, 23, Bizz, ...
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
        }   
        System.out.println();
    }
    
    public static void oneToThirtyW()
    {
        int i = 1; 
        while (i <= 30)
        {
            System.out.print(i + " ");
            i++;    
        }
        System.out.println();
    }
    
    public static void twentyToZeroF()
    {
        for (int i = 20; i >= 0; i=i-2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
 
    public static void twentyToZeroW()
    {
        int i = 20; 
        while (i >= 0)
        {
            System.out.print(i + " ");
            i=i-2;  
        }
        System.out.println();
    }
    
    public static void sumN(int n)
    {
        int count = 0;
        int i = 0; 
        while (i <= n)
        {
            count = count + i;
            i++;
        }
        System.out.println(count);
    }
    
    public static void countMtoN(int m, int n)
    {
        int i = m; 
        while (i <= n)
        {
            System.out.print(i + " ");
            i++;
        } 
        System.out.println();
    }
    
    public static void iLoveJava(int n)
    {
        int i = 0; 
        while (i < n)
        {
            System.out.println("I love Java.");
            i++;
        } 
    }
    
    public static void divBy2and9()
    {
        for (int i = 1; i <= 100; i++) {
            if (i%2==0 && i%9 == 0) {
                System.out.print(i + " ");
            }
        }   
        System.out.println();
    }
    
    public static void divBy3and8()
    {
        int i = 1; 
        while (i <= 100)
        {
            if (i%3==0 && i%8 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } 
        System.out.println();
    }
   
    public static void divBy5or7Sum()
    {
        int i = 0; 
        int count = 0;
        while (count <= 10000)
        {
            count = count+i;
            if (count%5==0 || count%7 == 0) {
                System.out.print(count + " ");
            }
            i++;
        } 
        System.out.println();
    }
    
    public static void bizzBuzz(int n)
    {
        int i = 1; 
        while (i <= n)
        {
            if (i%3 == 0) System.out.print("Bizz ");
            else if (i%5 == 0) System.out.print("Buzz ");
            else System.out.print(i + " ");
            i++;
        } 
        System.out.println();
    }
   
    // Test
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        twentyToZeroF();
        twentyToZeroW();
        sumN(12);
        countMtoN(3,14);
        iLoveJava(4);
        divBy2and9();
        divBy3and8();
        divBy5or7Sum();
        bizzBuzz(11);
    }
 }
 