import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 5. 7..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int NumberOfInputs;
        int[] Numbers;
        int NumberOfPrimes;
        boolean isPrime;

        input = new Scanner(System.in);
        NumberOfInputs = input.nextInt();
        Numbers = new int[NumberOfInputs];
        NumberOfPrimes = 0;
        isPrime = false;

        for(int i = 0; i < NumberOfInputs; i++){
            Numbers[i] = input.nextInt();
        }

        for(int i = 0; i < NumberOfInputs; i++){
            if(Numbers[i] == 2) isPrime = true;
            for(int j = 2; j < Numbers[i]; j++){
                if(Numbers[i] % j == 0){
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if(isPrime){
                NumberOfPrimes++;
                isPrime = false;
            }
        }

        System.out.println(NumberOfPrimes);

    }
}
