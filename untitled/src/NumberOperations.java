import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class NumberOperations {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            List<Integer> numbers = readNumbersFromFile(fileName);

            int min = _min(numbers);
            int max = _max(numbers);
            long sum = _sum(numbers);
            long mult = _mult(numbers);

            System.out.println("Минимальное: " + min);
            System.out.println("Максимальное: " + max);
            System.out.println("Сумма: " + sum);
            System.out.println("Произведение: " + mult);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        br.close();
        return Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int _min(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int _max(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static long _sum(List<Integer> numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static long _mult(List<Integer> numbers) {
        long mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
