import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 27..
 */
public class Main {
    static int[] Count0;
    static int[] Count1;

    private static int Fibonacci(int n, int i){
        if(n == 0){
            Count0[i]++;
            return 0;

        } else if(n == 1){
            Count1[i]++;
            return 1;
        } else {
            return Fibonacci(n-1, i) + Fibonacci(n-2, i);
        }
    }

    public static void main(String args[]){
        Scanner input;
        int numberOfCases;
        input = new Scanner(System.in);
        numberOfCases = input.nextInt();
        Count0 = new int[numberOfCases];
        Count1 = new int[numberOfCases];

        for(int i = 0; i < numberOfCases; i++){
            Count0[i] = 0;
            Count1[i] = 0;
            Fibonacci(input.nextInt(), i);
        }

        for(int i = 0; i < numberOfCases; i++){
            System.out.println(Count0[i] + " " + Count1[i]);
        }
    }
}
