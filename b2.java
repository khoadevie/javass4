import java.util.Scanner;

public class TongChanLeMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang cua mang: ");
        int rows = sc.nextInt();

        System.out.print("Nhap so cot cua mang: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        int tongChan = 0;
        int tongLe = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] % 2 == 0) {
                    tongChan += a[i][j];
                } else {
                    tongLe += a[i][j];
                }
            }
        }

        System.out.println("Tong cac so chan: " + tongChan);
        System.out.println("Tong cac so le: " + tongLe);
    }
}

