package payroll;

import payroll.employee;
import payroll.programmer;
import payroll.Assistantprofessor1;
import payroll.professor;
import payroll.Associativeprofessor;

public class Salary {
public static void main(String[] args) {
employee emp;
programmer prog;
Assistantprofessor1 ass1;
Associativeprofessor ass2;
professor pro;

emp=new employee("Raja",300001,"Chennai","account@gmail.com",9000000001l);

prog=new programmer("Kamal",600001,"Chennai","account@gmail.com",7000000001l, 100000);

ass1=new Assistantprofessor1("Kala",800001,"Chennai","account@gmail.com",4000000001l,50000);

ass2=new Associativeprofessor("ganesh",900001,"chennai","ag@gmail.com",500000012l,60000);

pro=new professor("rahul",500001,"kadappa","rk@gmail.com",600000009l,10000);


prog.Calculation();
ass1.Calculation();
ass2.Calculation();
pro.Calculation();

emp.printAccount();
prog.printAccount();
ass1.printAccount();
ass2.printAccount();
pro.printAccount();

}
}
