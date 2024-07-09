package Transpose;
class Multiply
{
    public static int[][] multiply(int[][] first, int[][] second)
    {
        int row = first.length, column = first[0].length;
        int[][] mult = new int[row][column];

        System.out.println("\nMultiply of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                mult[r][c] = first[r][c] * second[r][c];
        Print2dArray.print2dArray(mult);
        return mult;
    }
}