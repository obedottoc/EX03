/**created by m.uday kanth
 * eee-b, mail id:-udaykanth67@gmail.com
 * 
 *
 */
package Payroll;

public class Calculation {

public static void main(String[] args) {
   Programmer pro;
AssistantProfessor Asspro;
AssociativeProfessor Asopro;
Professor prof;
pro=new Programmer("uday",250076,"Chennai","account@gmail.com",667457845,786547);

Asspro=new AssistantProfessor("hari",698700,"Chennai","account@gmail.com",79857001l,89324);

Asopro=new AssociativeProfessor("suresh",960654,"Chennai","account@gmail.com",958574785,88769);

prof=new Professor("rajesh",900786,"chennai","account@gmail.com",895689561,675675);
pro.printStatement();
Asspro.printStatement();
Asopro.printStatement();
prof.printStatement();
}

}

