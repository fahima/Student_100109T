/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class StudentManagementSystemTest {

    StudentManagementSystem instance;
    Student stu;
    SimpleStudentRepository repo;

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new StudentManagementSystem();
        stu = new Student();
        repo = new SimpleStudentRepository();
        instance.setRepo(repo);
    }

    @After
    public void tearDown() {
        instance = null;
        stu = null;
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        instance.listAllStudents();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        instance.registerStudent(stu);
        // TODO review the generated test code and remove the default call to fail.

    }
}
