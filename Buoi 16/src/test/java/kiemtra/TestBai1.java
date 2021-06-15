package kiemtra;

import jdk.jfr.StackTrace;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestBai1 {
    Bai1 ktbai1= new Bai1();
    @Test
    public void kiemTra(){
        int count=7;
        Assertions.assertThat(count).isEqualTo(ktbai1.demTu());

    }
    @Test
    public void chuVietHoa(){

        String chuoi= "You Only Live Once. But If You Do It Right. Once Is Enough";
        Assertions.assertThat(chuoi).isEqualTo(ktbai1.vietHoa());

    }
}
