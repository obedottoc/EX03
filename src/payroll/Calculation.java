/*********
 * Program to represent calculation
 * Developed by
 * M.Upendra
 * upendra1234@gmail.com
 */
package payroll;
public class Calculation{


	public static void main(String[] args) {
		Programmer Pro;
		AssistantProfessor Asspro;
		AssociateProfessor AsoPro;
		Professor Prof;

			Pro=new Programmer("Raja",300001,"Chennai","account@gmail.com",9000000001l,6000);

			Asspro=new AssistantProfessor("Kamal",600001,"Chennai","account@gmail.com",7000000001l,7000);

			AsoPro=new AssociateProfessor("Kala",800001,"Chennai","account@gmail.com",4000000001l,8000);

			Prof=new Professor("nithin",900001,"chennai","account@gmail.com",50000000001l,10000);

			Pro.printAccount();			
			Asspro.Printstatement();
			AsoPro.Printstatement();
			Prof.Printstatement();
	}

}