import org.junit.Assert;
import org.junit.Test;

public class TestExample {
    Example vd =new Example();
    @Test
    public void exampleAssertEquals(){
        Assert.assertEquals(6,vd.tinhNhan());
        Assert.assertEquals(5, vd.sum(2,3));
        Assert.assertEquals(6,vd.sub(12,6));
        Assert.assertEquals(6,vd.division(12,2),0.0);
//        Assert.assertEquals(6,vd.division(12,2));
    }
    @Test
    public void exampleAsserNotEquals(){
        Assert.assertNotEquals(7,vd.tinhNhan());
        Assert.assertNotEquals(6, vd.sum(2,3));
        Assert.assertNotEquals(7,vd.sub(12,6));
        Assert.assertNotEquals(4,vd.division(12,2),0.0);
    }
   @Test
    public void exampleAssertTrue(){
        Assert.assertTrue(vd.kiemTraTamGic(2,3,4));
        Assert.assertTrue(vd.chiaHetcho2(4));
   }
   @Test
    public void exampleAssertFalse(){
     Assert.assertFalse(vd.chiaHetcho2(5));
     Assert.assertFalse(vd.kiemTraTamGic(1,2,4));
    }
    @Test
    public void exampleAsserNullAndNotNull(){
        String str= null;
        String str1="Duyen test";
        Assert.assertNull(str);
        Assert.assertNotNull(str1);
        Assert.assertNull(vd.getNull());

    }
    @Test
    public void exampleAsserArrayEqual(){
        int a[]={1,2,3};
        int b[]={1,2,3};
        Assert.assertArrayEquals(a,b);
    }
    @Test
    public void exampleAsserSameAndNotSame(){
        String strObject="Duyen test";
        String clonestrObject=strObject;
        String otherObject="Chăm học Java";
        Assert.assertSame(strObject,clonestrObject);
        Assert.assertNotSame(clonestrObject,otherObject);

    }
}
