/* Program to represent gross and net salary
 * author@karthik bhaskar
 * karthikbhaskar2000@gmail.com
 */
package payroll;

public class Calculation {

	public static void main(String[] args) {
	    Programmer pro;
		AssistantProfessor Asspro;
		AssociativeProfessor Asopro;
		Professor prof;
			pro=new Programmer("sunitha",17001300,"Chennai","account@gmail.com",900000000l,60000);

			Asspro=new AssistantProfessor("mahesh",17001301,"Chennai","account@gmail.com",7000000001l,70000);
			
			Asopro=new AssociativeProfessor("mahalakshmi",17001302,"Chennai","account@gmail.com",4000000001l,80000);
			
			prof=new Professor("nithin",17001303,"chennai","account@gmail.com",2000000001,100000);
			pro.printAccount();	
			Asspro.printStatement();
			Asopro.printStatement();
			prof.printStatement();
			}

}
