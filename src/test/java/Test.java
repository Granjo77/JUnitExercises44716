import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.example.Main;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})

    void isEvenTest(int number){
        assertTrue(Main.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})

    void isPrimeTest(int number){
        assertTrue(Main.isPrime(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23,23","46,23","115,23","184,23","207,23","230,23"})

    void isMultiple (int number,int divisor){
        assertTrue(Main.isMultiple(number, divisor));
    }
}
