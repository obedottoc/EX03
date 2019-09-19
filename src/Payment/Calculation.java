/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:3
 *EEE-A
 */
package Payment;

import Payment.Employee;
import Payment.Programmer;
import Payment.AssistantProfessor;
import Payment.AssociateProfessor;
import Payment.Professor;
public class Calculation {
	public static void main(String[] args) {

		Programmer pro1;
		AssistantProfessor asp1;
		AssociateProfessor ap1;
		Professor p1;
		
		
		pro1=new Programmer("divakar",10008,"chennai","diva08@gmail",9841127487l,5000);
		asp1=new AssistantProfessor("shelton",10020,"chennai","shel20@gmail",9841127488l,5500);
		ap1=new AssociateProfessor("charan",10018,"chennai","charan18@gmail",9841127489l,6000);
		p1=new Professor("kishore",10023,"chennai","kishore23@gmail",9841127480l,6500);
		pro1.printEmployee();
		asp1.printEmployee();
		ap1.printEmployee();
		p1.printEmployee();
	}

}
