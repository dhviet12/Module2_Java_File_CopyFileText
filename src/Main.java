import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("file");
        if (!directory.exists()) {
            directory.mkdir();
        }
        File sourceFile = new File("E:\\CodeGym\\Module 2 - Java Core\\Project\\Practice_File_CopyFileText\\file\\source.txt");
        try {
            if (!sourceFile.exists()) {
                sourceFile.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        File copyFile = new File("E:\\CodeGym\\Module 2 - Java Core\\Project\\Practice_File_CopyFileText\\file\\copy.txt");
        try {
            if (!copyFile.exists()) {
                copyFile.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(copyFile);
            String line;
            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
