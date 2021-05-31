public class Example {

    public int tinhNhan() {
        int a = 2;
        int b = 3;
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public boolean kiemTraTamGic(int a, int b, int c) {
        if ((a + b > c) & (a + c > b) & (b + c > a)) {
            return true;
        } else
            return false;
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public boolean chiaHetcho2(int a) {
        if (a % 2 == 0) {
            return true;
        } else
            return false;
    }

    public String getNull() {
        return null;
    }


}
