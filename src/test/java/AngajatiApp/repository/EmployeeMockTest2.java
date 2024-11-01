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
    public void testModifyEmployeeFunction_NullEmployee() {

        employeeMock.modifyEmployeeFunction(null, DidacticFunction.TEACHER);

        // Verify that no employee's function was modified
        assertEquals(DidacticFunction.ASSISTENT, employeeMock.getEmployeeList().get(0).getFunction());
        assertEquals(DidacticFunction.LECTURER, employeeMock.getEmployeeList().get(1).getFunction());
    }

    @Test
    public void testModifyEmployeeFunction_ExistingEmployee() {
        // Get the first employee from the list
        Employee employee = employeeMock.getEmployeeList().get(0);
        DidacticFunction newFunction = DidacticFunction.TEACHER;

        // Modify the function of this employee
        employeeMock.modifyEmployeeFunction(employee, newFunction);

        // Check that the function was updated correctly
        assertEquals(newFunction, employeeMock.getEmployeeList().get(0).getFunction());
    }

   }