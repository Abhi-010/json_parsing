package com.abhi.json.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class JacksonTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {
        Employee employee = new Employee();
        employee.setAge(30);
        employee.setFirstName("Naman");
        employee.setLastName("Bhalla");

        String json = objectMapper.writeValueAsString(employee);
        System.out.println(json);
    }

    @Test
    void jsonStringToPojo() throws JsonProcessingException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        Employee employee = objectMapper.readValue(employeeJson,Employee.class);

        //System.out.println(employee.toString());
        assertEquals("test","Jalil",employee.getFirstName());
    }

    @Test
    void jsonFileToPojo() throws IOException {
        File file = new File("src/test/employee.json");

        Employee employee = objectMapper.readValue(file, Employee.class);

        assertEquals("first",44,employee.getAge());

    }
}
