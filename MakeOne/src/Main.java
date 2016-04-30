import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 30..
 */
public class Main {

    public static void main(String args[]){
        Scanner input;
        int n;
        int[] countOperation;
        input = new Scanner(System.in);
        n = input.nextInt();
        countOperation = new int[n+1];

        for(int i = 1; i < n+1; i++){
            if(i == 1){
                countOperation[i] = 0;
            } else if(i == 2){
                countOperation[i] = 1;
            } else if(i == 3){
                countOperation[i] = 1;
            } else {
                if(i % 3 == 0){
                    if(countOperation[i/3] < countOperation[i-1]){
                        countOperation[i] = countOperation[i/3] + 1;
                    } else {
                        countOperation[i] = countOperation[i-1] + 1;
                    }
                } else if(i % 2 == 0){
                    if(countOperation[i/2] < countOperation[i-1]){
                        countOperation[i] = countOperation[i/2] + 1;
                    } else {
                        countOperation[i] = countOperation[i-1] + 1;
                    }
                } else {
                    countOperation[i] = countOperation[i-1] + 1;
                }
            }
        }

        System.out.println(countOperation[n]);
    }
}
