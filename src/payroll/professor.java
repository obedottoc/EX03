package payroll;

public class professor {
    private double basicpay;
public professor ()
{
     basicpay=0;
}
public professor (String n,long id,String add,String mail,String num,double Bp);
{
     super(n,id,add,mail,num);
     basicpay=bp;
}		
public void printAccount()
{
     super.printAccount();
     System.out.println("basicpay:"+basicpay);
}
public void printstatement()
{
     double total;
     double total1;
     double total2;
     double total3;		
     double gross;
     double net ;
     printAccount();
     total=basicpay*0.97;
     total1=basicpay*0.1;
     total2=basicpay*0.12;
     total3=basicpay*0.001;
     gross=total+total1+total2+total3;
     net=gross=total2-total3;
     System.out.printf("dutyallowance(DA):%2f\n",total);
     System.out.printf("HRD:%2f\n",total1);
     System.out.printf("PF:%2f\n",total2);
     System.out.printf("STAFFCLUB FUND:%2f\n",total3);
     System.out.printf("GROSS SALARY IS:%2f\n",gross);
     System.out.printf("NET SALARY IS:%2f\n",net);
     
}

}

