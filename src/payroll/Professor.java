package payroll;

public class Professor extends Employee {
    private double Basic_pay;
    public Professor()
    {
     Basic_pay=0;
    }
    public Professor (String n,long id,String ad,String mail,long num,double bp)
    {
        super(n,id,ad,mail,num);
        Basic_pay=bp;
    }
    public void printEmployee()
    {
        super.printEmployee();
        double DA,HRA,PF,STAFFCLUBFUND,GROSSSALARY,NETSALARY,DEDUCTION;
        DA=0.97*Basic_pay;
        HRA=0.1*Basic_pay;
        PF=0.12*Basic_pay;
        STAFFCLUBFUND=0.1*Basic_pay;
        DEDUCTION=PF+STAFFCLUBFUND;
        GROSSSALARY=+Basic_pay+DA+HRA;
        NETSALARY=GROSSSALARY-DEDUCTION;
        System.out.println("Basic_pay:"+Basic_pay);
        System.out.println("GROSSSALARY:"+GROSSSALARY);
        System.out.println("NETSALARY:"+NETSALARY);
    }
        
    
}



