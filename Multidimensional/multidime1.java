package Multidimensional;

public class multidime1 {
    public static void main(String[] args) {
        int numebr[][] = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}};

        for(int i = 0; i < numebr.length; i++){
            for(int j = 0; j < numebr[i].length; j++){
                System.out.print(numebr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}