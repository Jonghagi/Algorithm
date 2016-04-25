import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 25..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int N;
        int X;
        int[] numberList;
        input = new Scanner(System.in);
        N = input.nextInt();
        X = input.nextInt();

        numberList = new int[N];

        for(int i = 0; i < N; i++){
            numberList[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(numberList[i] < X){
                System.out.print(numberList[i] + " ");
            }
        }

    }
}
