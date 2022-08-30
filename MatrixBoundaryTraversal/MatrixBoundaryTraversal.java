package MatrixBoundaryTraversal;

public class MatrixBoundaryTraversal {
    static int num = 4;
    static int nums = 4;

    public static void Traversal(int number[][]){
        if(num == 1){
            for(int i = 0; i < nums; i++){
                System.out.print(number[0][i]+ " ");
            }
        } 
        else if(nums == 1){
                for(int i = 0; i < num; i++){
                    System.out.print(number[i][0]+ " ");
                }
            }
            else{
                for(int i = 0; i < nums; i++){
                    System.out.print(number[0][i] + " ");
                }
                for(int i = 1; i < num; i++){
                    System.out.print(number[i][nums - 1]+ " ");
                }
                for(int i = nums - 2; i >= 0; i--){
                    System.out.print(number[num - 1][i] + " ");
                }
                for(int i = num - 2; i >= 1; i--){
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
