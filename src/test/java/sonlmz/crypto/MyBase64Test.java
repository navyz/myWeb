package sonlmz.crypto;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Le Minh Son on 17/2/18.
 */
public class MyBase64Test {
    @Test
    public void encode() throws Exception {
        assertEquals(MyBase64.encode("123"), "MTIz");
    }

    @Test
    public void decode() throws Exception {
        assertEquals(MyBase64.decode("MTIz"), "123");
    }

}