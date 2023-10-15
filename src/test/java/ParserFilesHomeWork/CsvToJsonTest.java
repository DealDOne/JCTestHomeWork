package ParserFilesHomeWork;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.io.File;
import java.util.Arrays;
import java.util.List;


class CsvToJsonTest {
    static String[] columnMapping;
    static String dataCsvPath;
    static String dataXmlPath;

    @BeforeAll
    public static void setupColumnMapping(){
        columnMapping = new String[] {"id", "firstName", "lastName", "country", "age"};
        dataCsvPath = "data.csv";
        dataXmlPath = "data.xml";
    }
    @Test
    void filesExist() {
        Assertions.assertTrue(new File(dataCsvPath).exists() == new File(dataXmlPath).exists());
    }

    @Test
    void parseCSV() {
        // expected
        final List<Employee> result = Arrays.asList(new Employee(1, "John", "Smith", "USA", 25), new Employee(2, "Inav", "Petrov", "RU", 23));
        // then:
        Assertions.assertIterableEquals(result, CsvToJson.parseCSV(columnMapping, dataCsvPath));
    }

    @Test
    void bothParsersGiveTheSameResults() {
        Assertions.assertTrue(CsvToJson.parseCSV(columnMapping, dataCsvPath).equals(XmlToJSon.parseXML(dataXmlPath)));
    }
}