package Multidimensional;

public class multidimens3 {
    public static void main(String[] args) {
        int row = 3;
        int column = 2;
        int num[][] = new int[row][column];
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++)
            System.out.print(num[i][j]+ " ");
        }
        System.out.println();
    }
    
}
