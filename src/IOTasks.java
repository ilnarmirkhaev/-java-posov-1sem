import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception{
        Path f = Paths.get("a.txt");
        System.out.println(f.toAbsolutePath());
        fileIntSum(f);
    }

    private static void fileIntSum(Path f) throws Exception {
        int sum = 0;
        try (Scanner in = new Scanner(f)) {
            while (in.hasNext()) {
                if (in.hasNextInt())
                    sum += in.nextInt();
                else in.next();
            }
        } System.out.println(sum);
    }

}