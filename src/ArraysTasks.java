import java.util.Arrays;

public class ArraysTasks {
    // новый комментарий
    public static void main(String[] args) {
        int[] a = createEvenList(10);
        System.out.println("Массив a:\n" + Arrays.toString(a));
        System.out.printf("Есть ли в массиве повторяющиеся элементы - %b.\n", hasSimilar(a));

        System.out.println();

        int[] b = {20, 10, 30, 5, 5, 3, 6};
        System.out.println("Массив b:\n" + Arrays.toString(b));
        System.out.printf("Есть ли в массиве повторяющиеся элементы - %b.\n", hasSimilar(b));
        System.out.printf("Среднее значение массива = %.2f\n", avgList(b));
        int[] c = sortReverse(b);
        System.out.println("Копия массива b, отсортированная в обратном порядке:\n" + Arrays.toString(c));
        System.out.println("А массив b остался таким же:\n" + Arrays.toString(b));
    }

    private static int[] createEvenList(int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++)
            answer[i] = (i + 1) * 2;
        return answer;
    }

    private static boolean hasSimilar(int[] a) {
        int k = a.length;
        for (int i = 0; i < k - 1; i++)
            for (int j = i + 1; j < k; j++)
                if (a[i] == a[j])
                    return true;
        return false;

    }

    private static double avgList(int[] a) {
        double sum = 0;
        for (int x : a)
            sum += x;
        return sum / a.length;
    }

    private static int[] sortReverse(int[] a) {
        int[] aCopy = Arrays.copyOf(a, a.length), result = new int[a.length];
        int i = a.length - 1;
        Arrays.sort(aCopy);
        for (int x : aCopy)
            result[i--] = x;
        return result;
    }

}
