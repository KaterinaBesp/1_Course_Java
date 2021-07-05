package Lesson5;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int wage;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int wage, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }


    public void getInfoforEmployee() {
        System.out.println("fio:" + fullName + ", position:" + position + ", email:" + email + ", phone:" + phone
                + ", wage:" + wage + ", age:" + age);
    }

    int getAge(){
            return age;
    }

}
