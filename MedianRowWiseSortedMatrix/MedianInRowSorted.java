package MedianRowWiseSortedMatrix;

import java.util.Arrays;

public class MedianInRowSorted {
    static public int matMed(int mat[][], int row ,int column)
{
	int min = mat[0][0], max = mat[0][column - 1];
	for (int i = 1; i < row; i++)
	{
		if (mat[i][0] < min)
			min = mat[i][0];

		if (mat[i][column - 1] > max)
			max = mat[i][column - 1];
	}

	int medPos = (row * column + 1) / 2;
	while (min < max)
	{
		int mid = (min + max) / 2;
		int midPos = 0;
        int pos = 0;
		for (int i = 0; i < row; ++i){
			    pos = Arrays.binarySearch(mat[i],mid);
                
                if(pos < 0)
                    pos = Math.abs(pos) - 1;
                  
                
                else
                {
                    while(pos < mat[i].length && mat[i][pos] == mid)
                        pos += 1;
                }
                  
                midPos = midPos + pos;
		}
		if (midPos < medPos)
			min = mid + 1;
		else
			max = mid;
	}
	return min;
}

public static void main(String[] args)
{
	int row = 3, column = 5;
	int m[][]= { {5,10,20,30,40}, {1,2,3,4,6}, {11,13,15,17,19} };
	System.out.println("Median is " + matMed(m, row, column)); 
	
}
}
