public class TestStringBuild {

    public duyentest(){
        StringBuilder str1 = new StringBuilder("Thoa xynh");

        StringBuilder str2 = lessonString.reverseString(str1);
        assertThat(str2.toString().trim()).isNotEmpty().isEqualTo("hnyx aohT");

        StringBuilder str3 = lessonString.reverseString(str2);
        assertThat(str3.toString().trim()).isNotEmpty().isEqualTo("Thoa xynh");

        StringBuilder str1 = new StringBuilder("Thoa xynh");

        StringBuilder str2 = lessonString.reverseString(str1);
        StringBuilder str3 = lessonString.reverseString(str2);
        assertThat(str2.toString().trim()).isNotEmpty().isEqualTo("hnyx aohT");
        assertThat(str3.toString().trim()).isNotEmpty().isEqualTo("Thoa xynh");

    }
}
