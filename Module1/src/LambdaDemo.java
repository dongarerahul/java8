import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] arguments) {
        List<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);

        Collections.sort(numbers, (a, b) -> a.compareTo(b));
        System.out.println(numbers);
    }
}
