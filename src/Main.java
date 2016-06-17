import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Dlg5.java
// Редактирование текстового файла (незаконченный пример)
public class Main{

}
class Dlg5 extends JFrame {

    JTextArea txt;
    File curentFile = null;

    Dlg5() {
        super("Редактирование текстового файла");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        setSize(520, 400);
        Container c = getContentPane();
        JPanel pn = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 5));
        JButton btn1 = new JButton("Открыть");
        pn.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });
        JButton btn2 = new JButton("Записать");
        pn.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });

        c.add(pn, BorderLayout.NORTH);
        txt = new JTextArea();
        JScrollPane pane = new JScrollPane(txt);
        c.add(pane, BorderLayout.CENTER);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);

        setVisible(true);
    }

    public void open() {
        JFileChooser fc = new JFileChooser();
        ExtFileFilter ff1 = new ExtFileFilter("txt", "*.txt — текстовые файлы");
                fc.addChoosableFileFilter(ff1);
        ExtFileFilter ff2 = new ExtFileFilter("java", "*.java — программы на JAVA");
                fc.addChoosableFileFilter(ff2);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
//--- проверить, что это файл и он доступен для чтени
            if (!f.isFile() || !f.canRead()) {
                System.out.println("Файл " + f.getName() + " является каталогом или не"+
                        " доступен для чтения");
                return;
            }
            curentFile = f;
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(curentFile));
                for (; ; ) {
                    String str = in.readLine();
                    if (str == null)
                        break;
                    txt.append(str + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (in != null)
                    try {
                        in.close();
                    } catch (IOException e) {
                    }
            }
        }
    }

    public void save() {
    }

    public static void main(String[] args) {
        Dlg5 d = new Dlg5();
    }
}

class ExtFileFilter extends javax.swing.filechooser.FileFilter {

    String ext;
    String description;

    ExtFileFilter(String ext, String descr) {
        this.ext = ext;
        description = descr;
    }

    public boolean accept(File f) {
        if (f != null) {
            if (f.isDirectory()) {
                return true;
            }
            String extension = getExtension(f);
            if (extension == null)
                return (ext.length() == 0);
            return ext.equals(extension);
        }
        return false;
    }

    public String getExtension(File f) {
        if (f != null) {
            String filename = f.getName();
            int i = filename.lastIndexOf('.');
            if (i > 0 && i < filename.length() - 1) {
                return filename.substring(i + 1).toLowerCase();
            }
            ;
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

}