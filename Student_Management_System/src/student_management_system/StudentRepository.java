/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface StudentRepository {

    void saveStudent(Student stu);

    void deleteStudent(Student stu);

    Student findStudent(long regNumber);

    void updateStudent(Student stu);

    List<Student> findAllStudents();
}
