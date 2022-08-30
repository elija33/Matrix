package Passing2DArraysArguments;

public class Passing2DArray {
    public static void print(int[][] number){
        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println(); 
        }  
    }
    public static void main(String[] args) {
        int number[][] = {{1,2,3,4}, {5,6,7,8,9}};

        print(number);
    }
}
