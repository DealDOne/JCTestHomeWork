package ParserFilesHomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;


class CsvToJsonTest {

    @Test
    void parseCSV() {
        // given
        final String filePath = "data.csv";
        final String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        // expected
        final List<Employee> result = Arrays.asList(new Employee(1, "John", "Smith", "USA", 25), new Employee(2, "Inav", "Petrov", "RU", 23));
        // then:
        Assertions.assertIterableEquals(result, CsvToJson.parseCSV(columnMapping, filePath));
    }
}