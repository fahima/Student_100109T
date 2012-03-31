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
public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void listAllStudents() {
        List list = repo.findAllStudents();

        for (int i = 0; i < list.size(); i++) {
            Student stud = (Student) list.get(i);
            System.out.println(stud.getRegisterationNum() + "    " + stud.getFirstName() + "    " + stud.getLastName() + "  " + stud.getAddress());
        }

        //Get all the students from repository and print them in the screen
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
        //Save the new student using repository
    }
}
