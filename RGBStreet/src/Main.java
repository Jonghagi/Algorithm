import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 28..
 */
public class Main {
    static int[][] Color;
    static int N;

    public static int Coloring(int index, int currentColor, int Cost){
        int Cost1, Cost2;
        if(index < N-1){
            Cost1 = Cost + Color[index][currentColor];
            Cost2 = Cost + Color[index][currentColor];

            if(currentColor == 0){
                Cost1 = Cost1 + Coloring(index+1, 1, Cost);
                Cost2 = Cost2 + Coloring(index+1, 2, Cost);
            } else if(currentColor == 1){
                Cost1 = Cost1 + Coloring(index+1, 0, Cost);
                Cost2 = Cost2 + Coloring(index+1, 2, Cost);
            } else if(currentColor == 2){
                Cost1 = Cost1 + Coloring(index+1, 0, Cost);
                Cost2 = Cost2 + Coloring(index+1, 1, Cost);
            }

            if(Cost1 > Cost2){
                Cost = Cost2;
            } else {
                Cost = Cost1;
            }

            return Cost;

        } else if(index == N-1){
            return Color[index][currentColor];
        }
        return Cost;
    }


    public static void main(String args[]){
        Scanner input;
        int CostR, CostG, CostB;
        input = new Scanner(System.in);
        N = input.nextInt();
        Color = new int[N][3];


        for(int i = 0; i < N; i++){
            Color[i][0] = input.nextInt();
            Color[i][1] = input.nextInt();
            Color[i][2] = input.nextInt();
        }

        CostR = Coloring(0, 0, 0);
        CostG = Coloring(0, 1, 0);
        CostB = Coloring(0, 2, 0);


        if(CostR <= CostG && CostR <= CostB){
            System.out.println(CostR);
        } else if(CostB <= CostR && CostB <= CostG){
            System.out.println(CostB);
        } else {
            System.out.println(CostG);
        }
    }
}
