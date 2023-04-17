import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the height of triangle: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n+1;j++)
            {
                if( j >= n - i  && j <= n + i )
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}