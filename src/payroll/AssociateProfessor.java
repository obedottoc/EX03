package payroll;


public class AssociateProfessor extends Employee {

private double Basic_Pay;

public AssociateProfessor ()
{
Basic_Pay=0;
}

public AssociateProfessor  (String n,long id, String ad,String mail,long no,double bp)
{
super(n,id,ad,mail,no);
Basic_Pay=bp;
}
public void printEmployee()
{
super.printEmployee();
double DA,HRA,PF,STAFFCLUBFUND,GROSSSALARY,NETSALARY,DEDUCTION;
DA=0.97*Basic_Pay;
HRA=0.1*Basic_Pay;
PF=0.12*Basic_Pay;
STAFFCLUBFUND=10*Basic_Pay;
DEDUCTION=PF+STAFFCLUBFUND;
GROSSSALARY=Basic_Pay+DA+HRA+PF+STAFFCLUBFUND;
NETSALARY=GROSSSALARY-DEDUCTION;

System.out.println("Basic_Pay:"+Basic_Pay);
System.out.println("GROSSSALARY:"+GROSSSALARY);
System.out.println("NETSALARY:"+NETSALARY);
}

}