package MatrixSnakePattern;

public class SnakePattern {
    static int num = 4;
    static int numb = 4;

    public static void printSnake(int number[][]){
        for(int i = 0; i < num; i++){
            if(i % 2 == 0){
                for(int j = 0; j < numb; j++){
                    System.out.print(number[i][j] + " ");
                }
            }
            else{
                for(int j = numb - 1; j >= 0; j--){
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
