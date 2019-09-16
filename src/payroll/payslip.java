/****
 * Program for Payslip
 * @author Rositha V
 *  rosithav1@gmail.com
 */

package payroll;

public class payslip {
	private static Employee Emp;

	public static void main (String[]args) {
		Programmer pro;
		AssistantProfessor AssPro;
		AssociativeProfessor AsoPro;
		Professor Prof;
		Emp= new Employee("Roshh",300001,"chennai","account@gmail.com",9000001);
		AssPro=new AssistantProfessor ("Raja",600001,"chennai","account@gmail.com",70000001,50000);
		AsoPro=new AssociativeProfessor("Moni",8000001,"chennai","account@gmail.com",700001,70000);
		pro=new Programmer("Mari",8000001,"chennai","account@gmail.com",700001,70000);
		Prof=new Professor ("Yogee",9000001,"chennai","account@gmail.com",2000001,900000);
		pro.printAccount();
		AssPro.printStatement();
		AsoPro.printStatement();
		Prof.printStatement();	
	}
	

}
