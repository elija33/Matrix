package RotateMatrixAntiClockwise;

public class NaiveRotateAnitClockwise90 {
    static int nums = 4;

    public static void rotate90(int num[][]){
        int temp[][] = new int[nums][nums];

        for(int i = 0; i < nums; i++)
            for(int j = 0; j < nums; j++)
                temp[nums - j - 1][i] = num[i][j];


        for(int i = 0; i  < nums; i++){
            for(int j = 0; j < nums; j++)
            num[i][j] = temp[i][j];
        }
    }
    public static void main(String[] args) {
        int total[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        rotate90(total);

        for(int i = 0; i < nums; i++){
            for(int j = 0; j < nums; j++){
                System.out.print(total[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
