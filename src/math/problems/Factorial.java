package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
            int i,factorial=1;
            int n=5;

            for(i=1;i<=n;i++){
                factorial=factorial*i;
            }
            System.out.println("Iterative Method:" + "factorial of "+n+" is: "+factorial);

            // using recursion
            System.out.println("Factorial of 5 using recursive method: "+recursivefactorial(5));

        }
        // recursion method
        public static int recursivefactorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * recursivefactorial(n-1));
        }


    }


