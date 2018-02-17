package sonlmz.crypto;

import java.util.Base64;

/**
 * Created by Le Minh Son on 17/2/18.
 */
public class MyBase64 {

    private MyBase64() {}

    public static String encode(String text) {
        return new String(Base64.getEncoder().encode(text.getBytes()));
    }

    public static String decode(String cipher) {
        return new String(Base64.getDecoder().decode(cipher.getBytes()));
    }

}
