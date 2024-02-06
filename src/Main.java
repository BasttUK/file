import java.io.File;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File folder = new File("c:/Java/");

        for (File file : Objects.requireNonNull(folder.listFiles())){
            System.out.println(file.isFile());

        }
    }
}
