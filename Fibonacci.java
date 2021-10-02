package calculation;

public class Fibonacci{
    
    static void Fib(int N) {
        int first = 0, second = 1;
        int FibCounter = 0;
        while (FibCounter < N) {
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
            FibCounter += 1;
        }
    }

     public static void main(String args[]){
         int N = 8;
         Fib(N);
     }
}