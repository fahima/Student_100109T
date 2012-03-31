/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    public Map<Long, Student> getStudentsDb() {
        return studentsDb;
    }

    public void setStudentsDb(Map<Long, Student> studentsDb) {
        this.studentsDb = studentsDb;
    }

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegisterationNum(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {
        studentsDb.remove(stu.getRegisterationNum());
    }

    @Override
    public Student findStudent(long regNumber) {
        Student stud = (Student) studentsDb.get(regNumber);
        return stud;
    }

    @Override
    public void updateStudent(Student stu) {
        studentsDb.remove(stu.getRegisterationNum());
        studentsDb.put(stu.getRegisterationNum(), stu);
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> student;
        student = new ArrayList(studentsDb.values());
        return student;
    }
}
