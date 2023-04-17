public class Main {

    public void printMatrix(int matrix[][],int r,int c)
    {
        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%5d",matrix[i][j] );
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int row = 4;
        int column = 3;
        int a[][] = {{12,12,-3},{23,4,3},{2,4,3},{23,4,-5}};
        int b[][] = {{123,12,-23},{253,42,3},{22,4,23},{-23,44,-5}};
        int aAddb[][] = new int[4][3];

        Main matrix = new Main();
        matrix.printMatrix(a,row,column);
        System.out.println("+");
        matrix.printMatrix(b,row,column);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                aAddb[i][j] = a[i][j] + b[i][j];

            }
        }
        System.out.println("");
        matrix.printMatrix(aAddb,row,column);
    }
}