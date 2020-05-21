import java.nio.file.*;
import java.io.File;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) {
        System.out.println(fileIntegersSum("../words_and_ints.txt"));
    }

    private static int fileIntegersSum(File filename) {
        int answer = 0;
        Scanner in = new Scanner(filename, "utf8");
        if (in.hasNextInt())
            answer += in.nextInt();
        else in.next();
        return answer;
    }

}