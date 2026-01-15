import java.util.Scanner;

public class SelectionSortTimKiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Sap xep chon giam dan
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }

        System.out.println("Mang sau khi sap xep giam dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();

        // Tim kiem tuyen tinh
        int vtTuyenTinh = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                vtTuyenTinh = i;
                break;
            }
        }

        if (vtTuyenTinh != -1) {
            System.out.println("Tim kiem tuyen tinh: So " + x + " co tai vi tri " + (vtTuyenTinh + 1));
        } else {
            System.out.println("Tim kiem tuyen tinh: Khong tim thay");
        }

        // Tim kiem nhi phan (mang giam dan)
        int left = 0;
        int right = n - 1;
        int vtNhiPhan = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                vtNhiPhan = mid;
                break;
            } else if (a[mid] < x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (vtNhiPhan != -1) {
            System.out.println("Tim kiem nhi phan: So " + x + " co tai vi tri " + (vtNhiPhan + 1));
        } else {
            System.out.println("Tim kiem nhi phan: Khong tim thay");
        }
    }
}
