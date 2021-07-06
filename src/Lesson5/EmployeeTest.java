package Lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employee=new Employee[5];
        employee[0]=new Employee("Alex Alexandrovch","tester","Alex@gmail.com",985889,150000,29);
        employee[1]=new Employee("Ivan Ivanovich","tester1","Ivan@gmail.com",985888,160000,40);
        employee[2]=new Employee("Petr Petrovich","tester2","Petr@gmail.com",985887,170000,30);
        employee[3]=new Employee("Dmitry Ivanovich","tester3","Dmitry@gmail.com",985886,180000,45);
        employee[4]=new Employee("Fedor Alexandrovch","tester4","Fedor@gmail.com",985885,190000,47);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge()>40){
                employee[i].getInfoforEmployee();
            }

        }
    }
}
