import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Nhập vào số hàng: ");
        int col = scr.nextInt();
        System.out.println("Nhập vào số cột: ");
        int row = scr.nextInt();
        int[][] arrayA = new int[row][col];
        int[][] arrayB = new int[row][col];
        System.out.println("Nhập mang a");
        nhapMang(arrayA, col, row);
        System.out.println("Nhap mang b");
        nhapMang(arrayB, col, row);


//Tinh tong
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                //   int arrayTong[][] = arrayA[i][j] + arrayB[i][j];
                System.out.printf("[%d]", arrayA[i][j] + arrayB[i][j]);

            }
            System.out.println();
        }
// Chuyen vị
        int tem;
        int arr[][] = new int[row][col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[j][i] = arrayA[i][j];
            }
        }

        System.out.println("Mang chuyển vị A");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tem = arrayB[j][i];
                arrayB[j][i] = arrayB[i][j];
                arrayB[i][j] = tem;
            }
        }

        System.out.println("Mang chuyển vị B");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arrayB[i][j] + "\t");
            }
            System.out.println();
        }

    }

    static void nhapMang(int[][] arr, int col, int row) {
//        int n;
//        int m;
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Nhập phần tử mảng thứ arr[%d][%d]:", i, j);
                arr[i][j] = scr.nextInt();
                // System.out.println("Nhập phần tử mảng thứ j" + j);
            }

        }

//In phan tu mang
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                a.add(arr[i][j]);
                if (a.size() == 2) {
                    for (Integer integer : a) {
                        System.out.printf("%d", integer);
                    }
                    System.out.printf("Arr[%d][%d]: %d\n", i, j, arr[i][j]);
                }
//                System.out.printf("Arr[%d][%d]: %d\n", i, j, arr[i][j]);
                //System.out.printf("\t",arr[i][j]);

// tinh tong


            }
        }
        System.out.println();
    }
}
