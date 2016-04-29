import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 29..
 */
public class Main {

    public static void main(String args[]){
        Scanner input;
        int n;
        long[] numberOfPinary;
        input = new Scanner(System.in);
        n = input.nextInt();
        numberOfPinary = new long[n];

        for(int i = 0; i < n; i++){
            if(i == 0){
                numberOfPinary[i] = 1;
            } else if(i == 1){
                numberOfPinary[i] = 1;
            } else {
                numberOfPinary[i] = numberOfPinary[i-1] + numberOfPinary[i-2];
            }
        }
        System.out.println(numberOfPinary[n-1]);
    }
}
