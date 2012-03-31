/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author DELL
 */
public class SmsStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));

        StudentManagementSystem sms = (StudentManagementSystem) beanFactory.getBean("sms");
        SimpleStudentRepository ssp = (SimpleStudentRepository) beanFactory.getBean("sture");
        sms.listAllStudents();
        System.out.println("***************************************");
        Student stu5 = (Student) beanFactory.getBean("student5");
        Student stu6 = (Student) beanFactory.getBean("student6");
        Student stu7 = (Student) beanFactory.getBean("student7");

        sms.registerStudent(stu5);
        sms.registerStudent(stu6);
        sms.registerStudent(stu7);

        sms.listAllStudents();
    }
}
