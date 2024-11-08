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

   private EmployeeMock employeeMock;
    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testModifyEmployeeFunction_ExistingEmployee() {
        Employee employee = employeeMock.getEmployeeList().get(0);
        DidacticFunction newFunction = DidacticFunction.TEACHER;

        employeeMock.modifyEmployeeFunction(employee, newFunction);

        assertEquals(newFunction, employeeMock.getEmployeeList().get(0).getFunction());
    }

    @Test
    public void testModifyEmployeeFunction_NullEmployee() {

        employeeMock.modifyEmployeeFunction(null, DidacticFunction.TEACHER);

        assertEquals(DidacticFunction.ASSISTENT, employeeMock.getEmployeeList().get(0).getFunction());
        assertEquals(DidacticFunction.LECTURER, employeeMock.getEmployeeList().get(1).getFunction());
    }

}