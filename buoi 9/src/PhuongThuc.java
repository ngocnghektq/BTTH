import java.util.Scanner;

public class PhuongThuc {
     public String inra(){
         String name;
         int age;
         String adress;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("nhập Tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập Địa chỉ: ");
        adress = scanner.nextLine();
       // String str ="Tên tôi là: " +name, "năm nay tôi" + age + " tuổi, tôi đến từ " +adress;
        return "Tên tôi là: " +name +","+ "năm nay tôi" + age + " tuổi, tôi đến từ " +adress;

    }
}
