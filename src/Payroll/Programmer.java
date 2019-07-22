package Payroll;

   public class Programmer extends Employee {
   private double basicpay;
   
  public Programmer()
{
   basicpay=0;
}
  public Programmer(String n,long id,String add,String mail,long num,double BP)
{
	  super(n,id,add,mail,num);
	  basicpay=BP;
}
  public void printAccount()
{
	  super.printaccount();
	  System.out.println("basicpay:"+basicpay);

}
  public void printStatement()
 {
	  double total;
	  double total1;
	  double total2;
	  double total3;
	  double gross;
	  double net;
	  
printAccount();
total=basicpay*0.97;
total1=basicpay*0.1;
total2=basicpay*0.12;
total3=basicpay*0.001;
gross=total+total1+total2+total3;
net=gross-total2-total3;
System.out.printf("HRA:%2f\n",total);
System.out.printf("PF:%2f\n",total2);
System.out.printf("Staff club fund:%2f\n",total3);
System.out.printf("gross salary is:%2f\n",gross);
System.out.printf("net salary is:%2f\n",net);
System.out.printf("----------------------------------------");
System.out.printf("\n");
 }
}