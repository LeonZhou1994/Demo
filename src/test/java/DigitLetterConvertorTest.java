import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DigitLetterConvertorTest {

    @Test
    public void singledigitArrayToLetters() throws Exception {
        //SingleDigit Test
        List<String> result1 = DigitLetterConverter.digitArrayToLetters(new int[]{2,3});
        Assert.assertArrayEquals(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"},result1.toArray());
        //DoubleDigit Test
        List<String> result2 = DigitLetterConverter.digitArrayToLetters(new int[]{23,45});
        Assert.assertArrayEquals(new String[]{
                "ag","ah","ai","aj","ak","al",
                "bg","bh","bi","bj","bk","bl",
                "cg","ch","ci","cj","ck","cl",
                "dg","dh","di","dj","dk","dl",
                "eg","eh","ei","ej","ek","el",
                "fg","fh","fi","fj","fk","fl",},result2.toArray());
    }

    @Test
    public void errotTest() throws Exception {

        //Error Test
        List<String> result3 = DigitLetterConverter.digitArrayToLetters(new int[]{3,4,5});
        //List<String> result3 = DigitLetterConvertor.digitArrayToLetters(new int[]{1,0});
    }

    @Test
    public void digitToLetters() {
        char[] result1 = DigitLetterConverter.digitToLetters(2).toCharArray();
        Assert.assertArrayEquals(new char[]{'a', 'b', 'c'}, result1);
    }
}