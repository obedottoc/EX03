package PAYROLL;


public class salarycredited {
    public static void main(String[] args) {
       Employee1 emp;
       Programmer prog;
       AssistantProfessor ass1;
       AssociateProfessor ass2;
       Professor pro;

          emp=new Employee1("employee",300001,"Chennai","account@gmail.com",9000000001l);
          prog=new Programmer("programmer",300001,"Chennai","account@gmail.com",9000000001l,10000);
          ass1=new AssistantProfessor();
          ass2=new AssociateProfessor();
          pro=new Professor("professor",800001,"Chennai","account@gmail.com",4000000001l,40000);
          emp.printaccount();
          prog.calculation();
          ass1.calculation();
          ass2.calculation();
          pro.calculation();
          prog.printStatement();
          ass1.printStatement();
          ass2.printStatement();
          pro.printStatement();
   }
}