import org.junit.Assert;
import org.junit.Test;

public class Test1 {
//    public static void main(String[] args) {
//        Nhan testNhan= new Nhan();
//    }



    @Test
    public  void NhanetTestNhan() {
        Nhan nhan= new Nhan();
        Assert.assertEquals(6,nhan.tinhNhan());


    }




}
