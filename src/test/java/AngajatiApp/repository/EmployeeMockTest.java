package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static AngajatiApp.controller.DidacticFunction.TEACHER;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeMockTest {
  private EmployeeMock employeeMock;
    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addEmployeeTC1_FGood() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(7,"Ana", "Rus", "2950204039943", TEACHER, 5000.00));
        assertEquals(7, employeeMock.getEmployeeList().size());
    }

    @Test
    void addEmployeeTC2_FCnpLong() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(6, "Ana", "Rus", "22350204039943", TEACHER, 5000.00));
        assertEquals(6, employeeMock.getEmployeeList().size());

    }

    @Test
    void addEmployeeTC3_FSalaryNegative() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(6, "Ana", "Rus", "2235020403994", TEACHER, -1.0));
        assertEquals(6, employeeMock.getEmployeeList().size());
    }

    @Test
    void addEmployeeTC4_FLastNameWrong() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(6, "Ana", "7us", "2235020403994", TEACHER, 5000.0));
        assertEquals(6, employeeMock.getEmployeeList().size());
    }

    @Test
    void addEmployeeTC5_FCnpShort() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(6, "Ana", "7us", "223502040399", TEACHER, 5000.0));
        assertEquals(6, employeeMock.getEmployeeList().size());
    }
    @Test
    void addEmployeeTC6_FSalaryZero() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(6, "Ana", "Rus", "2235020403994", TEACHER, 0.0));
        assertEquals(6, employeeMock.getEmployeeList().size());
    }
    @Test
    void addEmployeeTC7_F() {
        assertEquals(6, employeeMock.getEmployeeList().size());
        employeeMock.addEmployee(new Employee(7, "Ana", "Rus", "2235020403994", TEACHER, 1.0));
        assertEquals(7, employeeMock.getEmployeeList().size());
    }

}