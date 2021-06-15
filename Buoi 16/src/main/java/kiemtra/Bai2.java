package kiemtra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public String nhapMK() {
        String passWord;
        System.out.println("Nhap vao PassWord: ");
        Scanner scn = new Scanner(System.in);
        passWord = scn.nextLine();
        return passWord;
    }
        public boolean checkUpperCase(String passWord){
            Boolean checkUppercase = false;
            int lengde = passWord.length();
            for(int i=0; i<lengde;i++) {
                if(Character.isUpperCase(passWord.charAt(i))){
                    checkUppercase = true;
                    break;
                }
            }
            return checkUppercase;
        }
//Kiem tra co it nhat 1 ky tu so
        public boolean checkDigit(String passWord){
            Boolean checkDigitv = false;
            int lengde = passWord.length();
            for(int i=0; i<lengde;i++) {
                if (Character.isDigit(passWord.charAt(i))) {
                    checkDigitv = true;
                    break;
                }
            }
            return checkDigitv;
        }
//Kiem ta it nhat 1 ky tu dac biet
        public boolean checkSpecial(String passWord) {
            if (passWord == null || passWord.trim().isEmpty()) {
                System.out.println("Chuỗi sai định dạng.");
                return false;
            }
            Pattern p = Pattern.compile("[^A-Za-z0-9]");
            Matcher m;
            m = p.matcher(passWord);
            // boolean checkSpecialChar = m.matches();
            boolean checkSpecialChar = m.find();
            return checkSpecialChar;
        }
//Kiểm tra có it hơn 10 ky tu
        public boolean checkLength(String passWord){
            if(passWord.length()<10){
                return true;
            }
            return false;
        }
    }



