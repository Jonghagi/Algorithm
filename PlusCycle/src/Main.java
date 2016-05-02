import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 5. 2..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int N;
        int firstNumber, lastNumber;
        int cycle, plus;
        boolean isN = false;
        input = new Scanner(System.in);
        N = input.nextInt();
        firstNumber = N / 10;
        lastNumber = N % 10;
        cycle = 0;

        while(!isN){
            cycle++;
            plus = firstNumber + lastNumber;
            plus = plus % 10;

            if(lastNumber * 10 + plus == N){
                isN = true;
            } else {
                firstNumber = lastNumber;
                lastNumber = plus;
            }
        }

        System.out.println(cycle);
    }
}
