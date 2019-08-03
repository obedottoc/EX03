/****
 * to calculate calculation
 * @author amanikanta69@gmail.com
 */
package payroll;

public class Calculation {
	public static void main(String[]args) {
		Programmer Pro;
		AssistantProfessor Asspro;
		AssociativeProfessor Asopro;
		Professor prof;
		Pro=new Programmer("Raja",300001,"chennai","account@gmail.com",94074567l,60000);
		
		Asspro=new AssistantProfessor("mani",245678,"chennai","account@gmail.com",23456789l,23456);
		
		Asopro=new AssociativeProfessor("vijay",654321,"chennai","account@gmail.com",98765432l,898765);
		
		prof=new Professor("harsha",456789,"chennai","account@gmail.com",23456789l,234567);
		
		Pro.printStatement();
		Asspro.printStatement();
		Asopro.printStatement();
		prof.printStatement();
		
		
		
		
	
		
	}

}
