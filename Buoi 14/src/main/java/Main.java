import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scr = new Scanner(System.in);
            System.out.println("Nhập vào cân nặng của bạn: ");
            int canNang = scr.nextInt();
            System.out.println("Nhập chiều cao của bạn: ");
            int chieuCao = scr.nextInt();

        } catch (InputMismatchException e3) {
            System.out.println("Cân nặng hoặc chiều cao phải là số");
        } catch (Exception e4) {
            System.out.println("Cân nặng hoặc chiều cao không được nhỏ hơn không");
        }


//try {
//            Scanner scr = new Scanner(System.in);
//        System.out.println("Nhập vào phần tử mảng");
//        int size= scr.nextInt();
//        int [] arr =new int[size];
//} catch (NegativeArraySizeException ex1){
//    System.out.println("Kích thước mảng không âm");
//} catch (InputMismatchException ex2) {
//    System.out.println("Kích thước mảng phải là số");
//}
//
//
//
//        try {
//            int a=7/0;
//            System.out.println(a);
//        } catch (Exception e ){
//            System.out.println("Không thể chia cho 0" +e.getMessage() +e.toString());
//
//        }
//        finally {
//            System.out.println("Khối lệnh luôn được thực thi");
//        }
//
//        try {
//            String str=null;
//            System.out.println(str.length());
//        } catch (Exception e ){
//            System.out.println("Không có kích thước cho chuỗi rỗng");
//        }
//        finally {
//            System.out.println("Khối lệnh luôn được thực thi");
//        }
//
//        try {
//            String str1 = "abc";
//            int num = Integer.parseInt(str1);
//        } catch (Exception e) {
//            System.out.println("abc không phải là số không thể ép kiểu");
//        } finally {
//            System.out.println("Đừng cố ép kiểu chữ nữa nha bạn");
//        }
        static float inputWeitht() throws WeightCheckingException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hãy nhập cân nặng của bạn: ");
            float weight = 0;
            try {
                weight = scanner.nextInt();
                if (weight < 0) throw new WeightCheckingException("Can nang ko duoc nho hon 0.");
            } catch (InputMismatchException e) {
                throw new WeightCheckingException("Can nang phai la mot so.");
            }
            return weight;



            public class WeightCheckingException extends Exception{
                public WeightCheckingException(String message) {
                    super(message);
                }

                @Override
                public String getMessage() {
                    return "Lỗi nhập vao Can nang " + super.getMessage();
                }
            }
            public class WeightCheckingException extends Exception{
                public WeightCheckingException(String message) {
                    super(message);
                }

                @Override
                public String getMessage() {
                    return "Lỗi nhập vao Can nang " + super.getMessage();
                }
            }

        }
        public void checkTuoi (int age){
            if (age<18){
                throw new ArithmeticException("Tuổi phải lơn hơn 18")
            } else
            {
                System.out.println("Tuổi lớn hơn 18 rồi nhé");
            }
        }




}
