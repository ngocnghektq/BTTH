import java.util.Scanner;

public class Bai6 {
    static int arr[];
    static int n;

    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Nhập vào số n: ");
//        n = scr.nextInt();
//        arr = new int[n];
//        nhapMang(n);
//        inMang();
//        soChanCuoiCung();
//        arrSoAm();
        //       inHinhTamGiac();
        bai10();

    }

    static void nhapMang(int n) {
        Scanner scr1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ i %d ", i);
            arr[i] = scr1.nextInt();
        }

    }

    static void inMang() {
        for (int j = 0; j < n; j++) {
            System.out.printf(arr[j] + "\t");
        }
    }

    static int soChanCuoiCung() {
        for (int j = n - 1; j >= 0; j--) {
            if ((arr[j]) % 2 == 0) {
                System.out.println("Phần tử chẵn cuối cùng của mảng: " + arr[j]);
                return 1;

            }
        }

        System.out.println("Mảng không có số chẵn");
        return -1;
    }

    static int arrSoAm() {
        for (int l = 0; l < n; l++) {
            if (arr[l] < 0) {
                System.out.println("Phần tử âm đầu tiên của mảng là: " + arr[l]);
                return 1;
            }
        }
        System.out.println("Mảng không có số âm");
        return -1;
    }

    static void inHinhTamGiac() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhập n: ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            print(i, n);
        }
    }

    static void print(int n, int height) {
        int space = height - n;
        printChar(space, " ");
        printChar(n, "* ");
        System.out.println("\n");
    }

    static void printChar(int n, String ch) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }

    static void bai10() {
        System.out.println("ggdfg");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hight: ");
        int hight = scanner.nextInt();
        System.out.println("nhập width: ");
        int width = scanner.nextInt();
        while ((hight < 0) || (width < 0)) {
            System.out.println("Nhập hight: ");
            hight = scanner.nextInt();
            System.out.println("nhập width: ");
            width = scanner.nextInt();

        }
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

