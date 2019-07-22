package payroll;

import payroll.AssistantProfessor;
import payroll.AssociateProfessor;
import payroll.Employee;
import payroll.Professor;
import payroll.Programmer;
public class Payslip {

public static void main(String[] args) {
Employee emp1;
AssistantProfessor asp1;
AssociateProfessor ap1;
Professor p1;
Programmer pro1;

emp1=new Employee("Tamil",300001,"Chennai","account@gmail.com",90000000001l);

asp1=new AssistantProfessor("Moni",600001,"Chennai","account@gmail.com",7000000001l, 500000.00);

ap1=new AssociateProfessor("Maari",600001,"Chennai","account@gmail.com",400000001l,200000.00);

p1=new Professor("Rosi",800001,"Chennai","account@gmail.com",4000000001l,30000.00);

pro1=new Programmer("sobhi",800001,"Chennai","account@gmail.com",4000000001l,40000.00);

emp1.printEmployee();
asp1.printEmployee();
ap1.printEmployee();
p1.printEmployee();
pro1.printEmployee();
}

}