import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception{
        String[] lines = {"Какой-то текст", "Ещё текст!", "Some text in English", ":)"};
        File f = new File("a.txt");
//        System.out.println(f.toAbsolutePath());
        fileIntSum(f);
        writeLinesToFile(lines, new File("b.txt"));
    }

    private static void fileIntSum(File f) throws Exception {
        int sum = 0;
        try (Scanner in = new Scanner(f)) {
            while (in.hasNext()) {
                if (in.hasNextInt())
                    sum += in.nextInt();
                else in.next();
            }
        } System.out.println(sum);
    }

    private static void writeLinesToFile(String[] lines, File f)  throws Exception{
        PrintStream ps = new PrintStream(f, StandardCharsets.UTF_8);
        for (String line : lines)
            ps.println(line);
        System.out.println("Строки записаны в файл");
    }

}