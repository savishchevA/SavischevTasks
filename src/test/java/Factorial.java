import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = cons.nextInt();
        if (number==0){
            System.out.println(1);
        }else if(number<0){
            System.out.println("You entered an invalid number!");
        }
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);

        Recursion fact = new Recursion();
        System.out.println(fact.fact(number));
    }
   private static class Recursion{
        long fact(long n) {
            long result;

            if(n == 1) return 1;
            result = fact(n - 1) * n;

            return result;

        }
    }
}
