// draw triangle 
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua tam giac: ");
        int n = scanner.nextInt();
        // Vòng lặp bên ngoài để in ra từng dòng của tam giác
        for (int i = 1; i <= n; i++) {
            // Vòng lặp bên trong để in ra khoảng trắng trước các dấu *
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Vòng lặp bên trong để in ra các dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Xuống dòng để in ra dòng tiếp theo của tam giác
            System.out.println();
        }
    }
}
