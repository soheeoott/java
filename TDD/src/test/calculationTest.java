import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculationTest {

    @Test
    void Addition() {

        String[] arr = {"7", "+", "7"};
        int num = Integer.parseInt(arr[0]);
        int result = Calculator.calculation(arr, num);

        Assertions.assertEquals(14 , result);
    }

    @Test
    void Subtraction() {

        String[] arr = {"7", "-", "7"};
        int num = Integer.parseInt(arr[0]);
        int result = Calculator.calculation(arr, num);

        Assertions.assertEquals(0 , result);
    }

    @Test
    void Division() {

        String[] arr = {"7", "/", "7"};
        int num = Integer.parseInt(arr[0]);
        int number = Calculator.calculation(arr, num);

        Assertions.assertEquals(1 , number);
    }

    @Test
    void Multiplication() {

        String[] arr = {"7", "*", "7"};
        int num = Integer.parseInt(arr[0]);
        int number = Calculator.calculation(arr, num);

        Assertions.assertEquals(49 , number);
    }
}