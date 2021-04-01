/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author chads
 */
public class StudentTest {
    
    private Student James;
    private Student Katy;
    private Student Will;
    
    @BeforeEach
    public void setUp() {
       James = new Student();
       Katy = new Student();
       Will = James;
    }
    
    @Test
    void ObjectIdentity () {
        assertSame(Will, James);
    }
    
    @Test
    void ObjectEquality () {
        assertEquals(Will, James);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void failingTest () { fail("The test case is a prototype.");
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    @Disabled
    public void disablingTest() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentGrade method, of class Student.
     */
    @Test
    @Disabled
    public void testGetStudentGrade() {
        System.out.println("getStudentGrade");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStudentGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentGrade method, of class Student.
     */
    @Test
    @Disabled
    public void testSetStudentGrade() {
        System.out.println("setStudentGrade");
        String studentGrade = "";
        Student instance = new Student();
        instance.setStudentGrade(studentGrade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    @Disabled
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    @Disabled
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Student instance = new Student();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    @Disabled
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
