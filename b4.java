import java.util.Scanner;

public class ChanTruocLeSau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Mang khong co phan tu");
            return;
        }

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[idx] = a[i];
                idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                b[idx] = a[i];
                idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
