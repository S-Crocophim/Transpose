package Transpose;

class Divide
{
    public static int[][] divide(int[][] first, int[][] second)
    {
        int row = first.length, column = first[0].length;
        int[][] divd = new int[row][column];

        System.out.println("\nDivide of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                divd[r][c] = first[r][c] / (second[r][c] != 0 ? second[r][c] : 1);

        Print2dArray.print2dArray(divd);
        return divd;
    }
}