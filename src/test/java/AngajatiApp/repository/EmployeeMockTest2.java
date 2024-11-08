package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMockTest2 {

   private EmployeeMock employeeMock2;
    @BeforeEach
    void setUp() {
        employeeMock2 = new EmployeeMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testModifyEmployeeFunction_ExistingEmployee() {
        Employee employee = employeeMock2.getEmployeeList().get(0);
        DidacticFunction newFunction = DidacticFunction.TEACHER;

        employeeMock2.modifyEmployeeFunction(employee, newFunction);

        assertEquals(newFunction, employeeMock2.getEmployeeList().get(0).getFunction());
    }

    @Test
    public void testModifyEmployeeFunction_NullEmployee() {

        employeeMock2.modifyEmployeeFunction(null, DidacticFunction.TEACHER);

        assertEquals(DidacticFunction.ASSISTENT, employeeMock2.getEmployeeList().get(0).getFunction());
        assertEquals(DidacticFunction.LECTURER, employeeMock2.getEmployeeList().get(1).getFunction());
    }
}