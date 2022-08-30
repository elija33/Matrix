package TransposeMatrix;

public class NaiveTransposeMatrix {
    static int num = 4;

    public static void transpose(int number[][]){
        int temp[][] = new int[num][num];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                temp[i][j] = number[j][i];
            }
        }

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                number[i][j] = temp[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int numbers[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        transpose(numbers);

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
