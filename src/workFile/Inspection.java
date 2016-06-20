package workFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 19.06.2016.
 */
public class Inspection {
    private static String[] exp =ini();

    private static String[] ini(){
        String[] export = new String[]{"txt", "rtf", "doc", "docx", "chm", "hlp", "htm", "html", "ttf",
                "pdf", "djvu", "fb2", "xls", "xlsx", "mdb", "accdb", "bmp", "gif", "jpg", "jpeg", "png"};
        return export;
    }
    


    static boolean expansion(String expansion) {
        for (String anExp : exp) {
            if ((anExp).equals(expansion)) return true;
        }
        System.out.println((char) 27 + "[31mInvalid expansion: " + (char) 27 + "[0m" + expansion);
        return false;
    }

    static boolean format(String fileName) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
        Matcher m = p.matcher(fileName);
        if (m.matches()) return true;
        else{
            System.out.println((char) 27 + "[31mInvalid file name: " + (char) 27 + "[0m" + fileName);
            return false;
        }

    }
}
