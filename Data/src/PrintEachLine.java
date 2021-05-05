import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    List<String> fileContent = null;
    Path filePath = Paths.get("src/my-file.txt");

    fileContent = getFileContent(filePath);

    System.out.println(filePath);
  }

  private static List<String> getFileContent(Path filePath) {
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
    return fileContent;
  }
}
