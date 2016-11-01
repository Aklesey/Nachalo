package workFile;

import static org.junit.Assert.*;
/**
 * Created by user on 21.06.2016.
 */
public class FileWorkTest {
    @org.junit.Test
    public void reading() throws Exception {
        FileWork.reading("folder", "ololo" ,"txt");
        FileWork.reading("folder", "ololo" ,"txsdgt");
        FileWork.reading("spdgm dsgom*^@^", "516");
        FileWork.reading("ololo" ,"txt");
    }

}