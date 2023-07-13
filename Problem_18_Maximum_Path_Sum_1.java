public class Problem_18_Maximum_Path_Sum_1{
    public static int findMaxSum(int[][] data) {
        for (int row = data.length - 2; row >= 0; row--)
            for (int col = 0; col < data[row].length; col++)
                data[row][col] += Math.max(data[row + 1][col], data[row + 1][col + 1]);
    
        return data[0][0];
    }
}