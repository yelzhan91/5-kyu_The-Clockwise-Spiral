public class CODEWARS {
    public static void main(String[] args) {
        int N = 3;
        int[][] res = new int[N][N];
        res = createSpiral(N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] createSpiral(int N) {
        int[][] res = new int[N][N];
        int value = 1;
        int minCol = 0;
        int maxCol = N-1;
        int minRow = 0;
        int maxRow = N-1;
        while (value <= N*N) {
            for (int i = minCol; i <= maxCol; i++) {
                res[minRow][i] = value;
                value++;
            }
            for (int i = minRow+1; i <= maxRow; i++) {
                res[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol-1; i >= minCol; i--) {
                res[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow-1; i >= minRow+1; i--) {
                res[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return res;
    }
}