import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.example.CU;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMarks {

    @ParameterizedTest
    @CsvSource({
            "1, 8.5, true",
            "2, 9.8, true",
            "3, 12.2, true"
    })
    void testInsertMarkCU(int numStudent, double mark, boolean expected) {
        CU cu = new CU("Matemática", 3);
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.searchStudent(numStudent) >= 0);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 8.5, false",
            "2, 9.8, true",
            "3, 12.2, true"
    })
    void testIsApproved(int numStudent, double mark, boolean expected) {
        CU cu = new CU("Matemática", 3);
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.isApproved(numStudent));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 8.5, 8.5",
            "2, 9.8, 9.8",
            "3, 12.2, 12.2"
    })
    void testSearchStudent(int numStudent, double mark, double expected) {
        CU cu = new CU("Matemática", 3);
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.searchStudent(numStudent));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 12, 2, 10, 3, 11, 11",
            "2, 10, 1, 11, 3, 12, 11",
            "3, 12, 1, 11, 2, 10, 11"
    })
    void testAverageCU(int numStudent1, double mark1, int numStudent2, double mark2, int numStudent3, double mark3, double expected) {
        CU cu = new CU("Matemática", 3);
        cu.insertMarkCU(numStudent1, mark1);
        cu.insertMarkCU(numStudent2, mark2);
        cu.insertMarkCU(numStudent3, mark3);
        assertEquals(expected, cu.averageCU());
    }

}
