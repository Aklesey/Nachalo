package workFile;

import java.io.*;

import static java.io.File.separator;


public class FileWork {
    public static void create(String fileName, String expansion) {
        creator("", fileName, expansion);
    }

    public static void create(String folder, String fileName, String expansion) {
        creator(folder, fileName, expansion);
    }

    public static void deleting(String fileName, String expansion) {
        deleting(System.getProperty("user.dir"), fileName, expansion);
    }

    public static void deleting(String folder, String fileName, String expansion) {
        if (expansion(fileName, expansion)) {
            if (folder.isEmpty()) folder = System.getProperty("user.dir");
            File file = new File(folder + separator + fileName + '.' + expansion);
            if (file.delete()) {
                System.out.printf((char) 27 + "[32m%s is deleted!" + (char) 27 + "[0m\n", file.getName());
            } else {
                System.out.println((char) 27 + "[31mDelete operation is failed. " + (char) 27 + "[0m");
            }
        }
    }


    public static void rename(String fileName, String expansion, String newFileName) {
        rename(System.getProperty("user.dir"), fileName, expansion, newFileName);
    }

    public static void rename(String folder, String fileName, String expansion, String newFileName) {

        if (expansion(fileName, expansion)) {
            File file1 = new File(folder + separator + fileName + '.' + expansion);
            File file2 = new File(folder + separator + newFileName + '.' + expansion);
            if (folder.isEmpty()) {
                file1 = new File(fileName + '.' + expansion);
                file2 = new File(newFileName + '.' + expansion);
            }

            if (file1.renameTo(file2)) {
                System.out.println((char) 27 + "[32mRename successfully. " + (char) 27 + "[0m");
            } else {
                System.out.println((char) 27 + "[31mRename failed. " + (char) 27 + "[0m");
            }
        }
    }

    public static void deleteByFilter(String folder, String expansion) {
        if (expansion(expansion)) {

            if (folder.isEmpty()) folder = System.getProperty("user.dir") + separator;
            File dir = new File(folder);
            FilenameFilter filter = new Filter(expansion);
            String[] list = dir.list(filter);

            for (String fileToDelete : list) {
                String temp = folder + separator + fileToDelete;
                File del = new File(temp);
                boolean isDeleted = del.delete();
                System.out.printf((char) 27 + "[32mFile %s deleted: %s\n" + (char) 27 + "[0m", temp, isDeleted);
            }
        }
    }


    public static void reading(String fileName, String expansion) {
        reading(System.getProperty("user.dir"), fileName, expansion);
    }

    public static void reading(String folder, String fileName, String expansion) {
        if (expansion(fileName, expansion)) {
            try {
                String str = folder + separator + fileName + '.' + expansion;
                File file = new File(str);
                if (folder.isEmpty()) file = new File(fileName + '.' + expansion);
                BufferedReader reader;
                reader = new BufferedReader(new FileReader(file));
                String temp;
                while ((temp = reader.readLine()) != null) {
                    System.out.println((char) 27 + "[7m" + temp + (char) 27 + "[0m");
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void written(String fileName, String expansion, String writesOne) {
        written(System.getProperty("user.dir"), fileName, expansion, writesOne);
    }

    public static void written(String folder, String fileName, String expansion, String writesOne) {
        if (expansion(fileName, expansion)) {
            String str = folder + separator + fileName + '.' + expansion;
            File dir = new File(folder);
            dir.mkdir();
            File file = new File(str);
            try {
                if (!file.exists()) file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(writesOne);
                bw.close();
                System.out.println((char) 27 + "[32mSuccessfully writed." + (char) 27 + "[0m");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void append(String fileName, String expansion, String app) {
        append(System.getProperty("user.dir"), fileName, expansion, app);
    }

    public static void append(String folder, String fileName, String expansion, String app) {
        if (expansion(fileName, expansion)) {

            String str = folder + separator + fileName + '.' + expansion;
            File dir = new File(folder);
            dir.mkdir();
            File file = new File(str);
            try {
                if (!file.exists()) file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("\n" + app);
                bw.close();
                System.out.println((char) 27 + "[32mSuccessfully appended." + (char) 27 + "[0m");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copy(String folder, String fileName, String expansion) {
        if (new File(folder + separator + fileName + '.' + expansion).exists()) {
            copyS(folder, folder, fileName, expansion);
        } else System.out.println((char) 27 + "[31mCopying can not be a non-existent file." + (char) 27 + "[0m");
    }

    public static void copy(String folder, String destinationFolder, String fileName, String expansion) {
        if (new File(folder + separator + fileName + '.' + expansion).exists())
            copyS(folder, destinationFolder, fileName, expansion);
        else System.out.println((char) 27 + "[31mCopying can not be a non-existent file." + (char) 27 + "[0m");
    }

    public static void copyPast(String destinationFolder, String fileName, String expansion) {
        copyPast(System.getProperty("user.dir"), destinationFolder, fileName, expansion);
    }

    public static void copyPast(String folder, String destinationFolder, String fileName, String expansion) {
        if (expansion(fileName, expansion)) {

            if (new File(folder + separator + fileName + '.' + expansion).exists()) {
                File dir = new File(destinationFolder);
                File copied = new File(destinationFolder + separator + fileName + '.' + expansion);
                if (destinationFolder.isEmpty()) {
                    dir = new File(System.getProperty("user.dir") + separator);
                    copied = new File(fileName + '.' + expansion);
                }
                dir.mkdir();
                InputStream inStream;
                OutputStream outStream;
                try {
                    File original = new File(folder + separator + fileName + '.' + expansion);

                    if (!copied.exists()) copied.createNewFile();
                    inStream = new FileInputStream(original);
                    outStream = new FileOutputStream(copied);
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = inStream.read(buffer)) > 0) outStream.write(buffer, 0, length);
                    inStream.close();
                    outStream.close();
                    System.out.println((char) 27 + "[32mFile is copied successful!" + (char) 27 + "[0m");
                    deleting(folder, fileName, expansion);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else System.out.println((char) 27 + "[31mCopying can not be a non-existent file." + (char) 27 + "[0m");

        }
    }

    private static void copyS(String folder, String destinationFolder, String fileName, String expansion) {
        if (expansion(fileName, expansion)) {

            File dir;
            if (destinationFolder.isEmpty()) dir = new File(System.getProperty("user.dir") + separator);
            else dir = new File(destinationFolder);
            dir.mkdir();
            InputStream inStream;
            OutputStream outStream;
            try {
                File original = new File(folder + separator + fileName + '.' + expansion);
                File copied = new File(destinationFolder + separator + "copy_" + fileName + '.' + expansion);
                if (!copied.exists()) copied.createNewFile();
                inStream = new FileInputStream(original);
                outStream = new FileOutputStream(copied);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inStream.read(buffer)) > 0) outStream.write(buffer, 0, length);
                inStream.close();
                outStream.close();
                System.out.println((char) 27 + "[32mFile is copied successful!" + (char) 27 + "[0m");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean expansion(String expansion) {
        return Inspection.expansion(expansion);
    }

    private static boolean expansion(String fileName, String expansion) {
        return Inspection.expansion(expansion) && Inspection.format(fileName);
    }

    private static void creator(String folder, String fileName, String expansion) {
        File dir = new File(System.getProperty("user.dir") + separator + folder);
        dir.mkdir();
        if (expansion(fileName, expansion)) {
            try {
                File file = new File(dir, fileName + '.' + expansion);
                if (file.createNewFile()) {
                    System.out.printf((char) 27 + "[32mFile %s is created!" +
                            (char) 27 + "[0m\n", (fileName + '.' + expansion));
                } else {
                    System.out.printf((char) 27 + "[34mFile %s already exists." +
                            (char) 27 + "[0m\n", (fileName + '.' + expansion));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void sotrTXT() {
        sotrTXT(System.getProperty("user.dir") + separator);
    }

    public static void sotrTXT(String folder) {
        File dir = new File(folder);
        if (dir.exists()) {
            FilenameFilter filter = new Filter("txt");
            String[] list = dir.list(filter);

            for (String fileTXT : list) {
                System.out.println(fileTXT);

            }
        } else {
            System.out.println((char) 27 + "[31mFolder is non-existent" + (char) 27 + "[0m");
        }
    }

    public static void sotr(String expansion) {
        sotr(System.getProperty("user.dir"), expansion);
    }

    public static void sotr(String folder, String expansion) {
        if (expansion(expansion)) {

            File dir = new File(folder);
            if (dir.exists()) {
                FilenameFilter filter = new Filter("txt");
                String[] list = dir.list(filter);

                for (String fileTXT : list) {
                    System.out.println(fileTXT);

                }
            } else {
                System.out.println((char) 27 + "[31mFolder is non-existent" + (char) 27 + "[0m");
            }
        }
    }

    public static void sotrDocument() {
        sotrDocument(System.getProperty("user.dir") + separator);
    }

    public static void sotrDocument(String folder) {
        File dir = new File(folder);
        if (dir.exists()) {
            FilenameFilter filter = new Filter("doc");
            FilenameFilter filter1 = new Filter("docx");
            FilenameFilter filter2 = new Filter("chm");
            FilenameFilter filter3 = new Filter("hlp");
            FilenameFilter filter4 = new Filter("htm");
            FilenameFilter filter5 = new Filter("html");
            FilenameFilter filter6 = new Filter("ttf");
            FilenameFilter filter7 = new Filter("xls");
            FilenameFilter filter8 = new Filter("pdf");
            FilenameFilter filter9 = new Filter("djvu");
            FilenameFilter filter0 = new Filter("fb2");
            FilenameFilter filter11 = new Filter("xlsx");
            FilenameFilter filter12 = new Filter("mdb");
            FilenameFilter filter13 = new Filter("accdb");
            String[] list = dir.list(filter);
            String[] list1 = dir.list(filter1);
            String[] list2 = dir.list(filter2);
            String[] list3 = dir.list(filter3);
            String[] list4 = dir.list(filter4);
            String[] list5 = dir.list(filter5);
            String[] list6 = dir.list(filter6);
            String[] list7 = dir.list(filter7);
            String[] list8 = dir.list(filter8);
            String[] list9 = dir.list(filter9);
            String[] list0 = dir.list(filter0);
            String[] list11 = dir.list(filter11);
            String[] list12 = dir.list(filter12);
            String[] list13 = dir.list(filter13);
            for (String file : list) System.out.println(file);
            for (String file : list1) System.out.println(file);
            for (String file : list2) System.out.println(file);
            for (String file : list3) System.out.println(file);
            for (String file : list4) System.out.println(file);
            for (String file : list5) System.out.println(file);
            for (String file : list6) System.out.println(file);
            for (String file : list7) System.out.println(file);
            for (String file : list8) System.out.println(file);
            for (String file : list9) System.out.println(file);
            for (String file : list0) System.out.println(file);
            for (String file : list11) System.out.println(file);
            for (String file : list12) System.out.println(file);
            for (String file : list13) System.out.println(file);
        } else {
            System.out.println((char) 27 + "[31mFolder is non-existent" + (char) 27 + "[0m");
        }
    }

    public static void sotrPictur() {
        sotrPictur(System.getProperty("user.dir") + separator);
    }

    public static void sotrPictur(String folder) {

        File dir = new File(folder);
        if (dir.exists()) {
            FilenameFilter filter = new Filter("bmp");
            FilenameFilter filter1 = new Filter("gif");
            FilenameFilter filter2 = new Filter("jpg");
            FilenameFilter filter3 = new Filter("jpeg");
            FilenameFilter filter4 = new Filter("png");
            String[] list = dir.list(filter);
            String[] list1 = dir.list(filter1);
            String[] list2 = dir.list(filter2);
            String[] list3 = dir.list(filter3);
            String[] list4 = dir.list(filter4);
            for (String file : list) System.out.println(file);
            for (String file : list1) System.out.println(file);
            for (String file : list2) System.out.println(file);
            for (String file : list3) System.out.println(file);
            for (String file : list4) System.out.println(file);
        } else {
            System.out.println((char) 27 + "[31mFolder is non-existent" + (char) 27 + "[0m");
        }
    }
}
