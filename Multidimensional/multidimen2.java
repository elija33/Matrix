package Multidimensional;

public class multidimen2 {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        int num[][] = new int[row][column];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = 10;
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
