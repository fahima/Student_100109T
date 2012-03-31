/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

/**
 *
 * @author DELL
 */
public class Student {

    private long regNum;
    private String firstName;
    private String lastName;
    private String address;

    public long getRegisterationNum() {
        return regNum;
    }

    public void setRegisterationNum(long registerationNum) {
        this.regNum = registerationNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
