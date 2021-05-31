import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public void soSanh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();
        Random ran = new Random();
       int number= ran.nextInt();
        System.out.println(number);
       if (n<number){
           System.out.println("Số nhập từ bàn phím nhỏ hơn rồi");
       } else if (n>number){
           System.out.println("Số nhập từ bàn phím lớn hơn rồi");
       } else
           System.out.println("Hai số bằng nhau");
    }
}
