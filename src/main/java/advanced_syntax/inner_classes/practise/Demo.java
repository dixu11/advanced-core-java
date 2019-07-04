package advanced_syntax.inner_classes.practise;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.listJavaFiles("src/main/java/advanced/lambda");
        demo.printJavaFiles("src/main/java/advanced/lambda");
    }


    void listJavaFiles(String dirName) {    // argument - nazwa katalogu

        File dir = new File(dirName);         // katalog jako obiekt typu File

        // listowanie z filtrowaniem nazw
        // kryteria wyboru nazw podajemy za pomocę
        // implementacji metody accept
        // w lokalnej anonimowej klasie

        String[] fnames = dir.list(new FilenameFilter() {

            public boolean accept(File directory, String fname) {
                return fname.endsWith(".java");

            }
        });

        for (int i = 0; i < fnames.length; i++) {  // lista -> stdout
            System.out.println(fnames[i]);
        }


    }

    private void printJavaFiles(String path) {
        File file = new File(path);
        String variable = ".java"; // stała
        File[] filePaths = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(variable);
            }
        });

        if (Objects.isNull(filePaths)) {
            return;
        }

        for (File filePath : filePaths) {
            System.out.println(filePath.getName());
        }
    }
}

