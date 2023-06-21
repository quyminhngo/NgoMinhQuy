public class AddTwoMatrix {
    public static void main(String[] args) {
        // Initialize two matrices of the same size
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] secondMatrix = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        // Initialize a result matrix to store the sum of the two matrices
        int[][] resultMatrix = new int[3][3];

        // Add the corresponding elements of the two matrices and store the sum in the
        // result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Print the result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
