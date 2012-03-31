/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
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
public class SimpleStudentRepositoryTest {

    Map map;
    Student stu;
    SimpleStudentRepository instance;

    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {

        stu = new Student();
        instance = new SimpleStudentRepository();
        stu.setFirstName("Fathima");
        stu.setLastName("fahima");
        stu.setAddress("Moratuwa");
        stu.setRegisterationNum(4567);
    }

    @After
    public void tearDown() {
        stu = null;
    }

    /**
     * Test of saveStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        instance.saveStudent(stu);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        instance.deleteStudent(stu);
        // TODO review the generated test code and remove the default call to fail.
        //assertEquals(null,stu);
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 4567;
        instance.saveStudent(stu);
        Student result = instance.findStudent(regNumber);
        assertEquals("Fathima", result.getFirstName());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");

        stu.setFirstName("shahila");
        instance.updateStudent(stu);
        Student result = instance.findStudent(4567);
        assertEquals("shahila", result.getFirstName());
    }
}
