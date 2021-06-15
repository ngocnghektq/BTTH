import kiemtra.Bai1;
import kiemtra.Bai2;
import kiemtra.Bai3;

public class Main {
    public static void main(String[] args) {
        //Bai3 bai3= new Bai3();
        // bai3.nhapSo();
        // Bai1 bai1= new Bai1();
        // bai1.demTu();
        Bai2 bai2 = new Bai2();
        //bai2.nhapMK();
        String passWord = bai2.nhapMK();
        if (bai2.checkLength(passWord)) {
            System.out.println("Mật khẩu yếu.");
        }
        if ((bai2.checkDigit(passWord) == false) || (bai2.checkSpecial(passWord) == false) || (bai2.checkUpperCase(passWord) == false)) {
            System.out.println("Mật khẩu chưa đủ mạnh");
        }
    }


}


