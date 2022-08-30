package SeaarchRowWiseColumnWiseMatrix;

public class EfficientSearchRowColumnWise {
    static int row = 4;
    static int column = 4;

    public static void search(int number[][], int target){
        int num = 0;
        int numb = column - 1;

        while(num < row && numb >= 0){
            if(number[num][numb] == target){
                System.out.println("Found at (" + num + ", " + numb + ")");
                return;
            }
            else if(number[num][numb] > target){
                numb--;
            }
            else{
                num++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int number[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 36, 45},
                          {32, 33, 39, 50}};

        int target = 36;
        search(number, target);
    }
}
