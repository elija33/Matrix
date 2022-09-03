package MatrixSnakePattern;

public class SnakePattern {
    static int row = 4;
    static int column = 4;

    public static void printSnake(int number[][]){
        for(int i = 0; i < row; i++){
            if(i % 2 == 0){
                for(int j = 0; j < column; j++){
                    System.out.print(number[i][j] + " ");
                }
            }
            else{
                for(int j = column - 1; j >= 0; j--){
                    System.out.print(number[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            int number[][] = {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16}};
            printSnake(number);
    }
}
