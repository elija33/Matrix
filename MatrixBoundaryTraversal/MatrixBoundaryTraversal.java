package MatrixBoundaryTraversal;

public class MatrixBoundaryTraversal {
    static int row = 4;
    static int column = 4;

    public static void Traversal(int number[][]){
        if(row == 1){
            for(int i = 0; i < column; i++){
                System.out.print(number[0][i]+ " ");
            }
        } 
        else if(column == 1){
                for(int i = 0; i < row; i++){
                    System.out.print(number[i][0]+ " ");
                }
            }
            else{
                for(int i = 0; i < column; i++){
                    System.out.print(number[0][i] + " ");
                }
                for(int i = 1; i < row; i++){
                    System.out.print(number[i][column - 1]+ " ");
                }
                for(int i = column - 2; i >= 0; i--){
                    System.out.print(number[row - 1][i] + " ");
                }
                for(int i = row - 2; i >= 1; i--){
                    System.out.print(number[i][0]+ " ");
                }
            } 
    }
    public static void main(String[] args) {
        int number[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        Traversal(number);
    }
}
