package Transpose;

public class Rotate {
    public static int[][] rotateToNormal(int[][] transposed)
    {
        int row = transposed[0].length;
        int column = transposed.length;
        int[][] normal = new int[row][column];

        System.out.println("\nRotation to Normal Matrix:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                normal[r][c] = transposed[c][r];

        Print2dArray.print2dArray(normal);
        return normal;
    }
}
