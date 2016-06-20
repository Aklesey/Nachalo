package workFile;

/**
 * Created by user on 11.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        FileWork.sotr("txtsr");
        FileWork.sotrTXT();
        FileWork.sotrPictur();
        FileWork.copy("wrinetFolder", "copy_test1", "txt");
        FileWork.create("wrinetFolder", "copy_test1", "txt");
        FileWork.copyPast("wrinetFolder", "hadh", "copy_test1", "txt");
        FileWork.append("wrinetFolder", "test1", "txt", "testgasrh2");
        FileWork.reading("jiagh", "olo_lo4", "docx");
        FileWork.create("olo lo", "docx");
        FileWork.create("olo_lo", "docx");
        FileWork.create("fileTXT", "txt");
        FileWork.create("jiagh", "olo_lo", "docx");
        for (int i = 0; i < 15; i++) FileWork.create("olo_lo" + i, "docx");
        FileWork.create("olo lo", "dox");
        FileWork.create("ololo", "dox");
        FileWork.create("ololo", "docx");
        FileWork.deleting("ololo", "docx");
        FileWork.rename("", "fileTXT", "txt", "trahtenberg");
        FileWork.reading("jiagh", "olo_lo5", "txt");
        FileWork.deleteByFilter("", "docx");
    }
}
