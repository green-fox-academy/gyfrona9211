import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class pronteachline {
  public static void main(String[] args) {
    File data = getfile("src/test.txt");
    printlines(data);
  }

  public static File getfile(String path) {
    File file = new File(path);
    return file;
  }

  public static void printlines(File data) {

    try {
      Scanner scanner = new Scanner(data);
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
  }
}
