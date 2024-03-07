public class Fib
{
    // Fib modified results

    public static int fib(int n) {
       if(n <= 1) {

           return n;
       }
        else
            return fib(n - 1) + fib(n - 2);
    }
  // 6765 // Time complexity is O(2^n), it is provable through master theorem
    public static void main(String[] args)
    {

        int result = fib(20); // You can replace with any number
        System.out.println("Fib result: " + result);



    }


}
