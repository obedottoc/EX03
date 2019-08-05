/****
 * Program for Payslip generation
 * @author Pavan Kalyan
 *  npkr.nvrr@outlook.com
 */
package payroll;

public class payslip {
	public static void main (String[]args) {
		Programmer pro;
		AssistantProfessor AssPro;
		AssociativeProfessor AsoPro;
		Professor Prof;
		pro=new Programmer("Pavan",300001,"chennai","pavan@gmail.com",9000001,600000);
		AssPro=new AssistantProfessor ("Kalyan",600001,"chennai","kalyan@gmail.com",70000001,50000);
		AsoPro=new AssociativeProfessor("Sumanth",8000001,"nellore","sumanth@gmail.com",700001,70000);
		Prof=new Professor ("Reddy",9000001,"kadapa","reddy@gmail.com",2000001,900000);
		pro.printAccount();
		AssPro.printStatement();
		AsoPro.printStatement();
		Prof.printStatement();	
	}
	

}
