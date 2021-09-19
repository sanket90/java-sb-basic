import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTDDRules {
    /*
    Write production code only to pass a failing unit test.

    Write no more of a unit test than sufficient to fail (compilation failures are failures).

    Write no more production code than necessary to pass the one failing unit test.
     */


    @Test
    public void testXYZ() {
        MyEncryptionClass m1 = new MyEncryptionClass();
        String originalText = "ab";
        String secret = "cd";
        String encryptedText = m1.encrypt(originalText, secret);

        Assertions.assertEquals("CDAB", encryptedText);
    }
}


class MyEncryptionClass {

    String encrypt(String originalText, String secret) {
        return (secret + originalText).toUpperCase();
    }


    void encrypt() {

    }

}
