
package com.json.beans;

/**
 *
 * @author jayesh
 */
public class employeeDetails {
    private String first_name;
    private String last_name;
    private String skill;
    private int age;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee {" + "first_name=" + first_name + ", last_name=" + last_name + ", skill=" + skill + ", age=" + age + '}';
    }
    
}
