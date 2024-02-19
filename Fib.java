public class Fib
{
    // Fib modified results

    public static int fib(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args)
    {

        int result = fib(50); // You can replace with any number
        System.out.println("Fib result: " + result);



    }


}
