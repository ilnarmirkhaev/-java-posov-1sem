import java.util.Arrays;

public class TwoDimensionalArrayTask {

    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
//        1. `createTable(20, '.')` возвращает массив char 20 на 20, все символы в массиве должны быть '.'
//        2. `printTable` печатает массив на экран. При этом выводите символы подряд, без запятых. Можете вывести пробелы между символами, так получается более красиво.
//        3. `fillFirstAndLastLines` Воспользуйтесь `Arrays.fill()`, чтобы заполнить первую и последнюю строки массива символами '#'.
//        4. `fillFirstAndLastColumns` Заполните первый и последний столбец массива символами '#'.
    }

    private static char[][] createTable(int n, char symbol) {
        char[][] table = new char[n][n];
        for (char[] row : table) {
            Arrays.fill(row, symbol);
        }
        return table;
    }

    private static void printTable(char[][] table) {
        int len = table[0].length;
        for (char[] row : table) {
            for (int i = 0; i < len - 1; i++) {
                System.out.print(row[i]);
                System.out.print(' ');
            }
            System.out.println(row[len - 1]);
        }
    }

    private static void fillFirstAndLastLines(char[][] table, char symbol) {
        int len = table.length;
        Arrays.fill(table[0], symbol);
        Arrays.fill(table[len - 1], symbol);
    }

    private static void fillFirstAndLastColumns(char[][] table, char symbol) {
        int len = table[0].length;
        for (char[] row : table) {
            row[0] = symbol;
            row[len - 1] = symbol;
        }
    }
}
