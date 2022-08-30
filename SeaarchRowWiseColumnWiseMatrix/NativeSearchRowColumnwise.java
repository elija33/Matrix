package SeaarchRowWiseColumnWiseMatrix;

public class NativeSearchRowColumnwise {
    static int row = 5;
    static int column = 5;
    public static void search(int matrix[][], int terget){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(matrix[i][j] == terget){
                    System.out.println("Found at (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int number[][] = {{10,20,30,40,50},
                          {60,70,80,90,95},
                          {85,75,65,55,45},
                          {35,25,15,12,14},
                          {16,18,19,17,15}};

            int terget = 65;

            search(number, terget);
    }
}
