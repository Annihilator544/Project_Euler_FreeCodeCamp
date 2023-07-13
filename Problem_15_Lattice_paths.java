public class Problem_15_Lattice_paths{
public static void main(String[] args) {
    int n = 20;
    long matrix[][] = new long[n][n];
    for (int i = 0; i < n; i++) {
        matrix[i][0] = i + 2;
        matrix[0][i] = i + 2;
    }
    for (int i = 1; i < n; i++) {
        for (int j = i; j < n; j++) {      // j>=i
            matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            matrix[j][i] = matrix[i][j];   // avoids double computation (difference)
        }
    }
    System.out.println(matrix[n - 1][n - 1]);
}
}