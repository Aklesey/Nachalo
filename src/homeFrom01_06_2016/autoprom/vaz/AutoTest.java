package homeFrom01_06_2016.autoprom.vaz;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Andrii Bushlyakov for WebCamp.
 */
public class AutoTest {

    @Test
    public void randomeDate() throws Exception {
        Date date = new Date();
        Thread.sleep(1000);
        assertEquals(date, new Date());
    }
}