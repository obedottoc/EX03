/*****
 * @author vijaykumarkaranam100@gmail.com
 * to create calculation payroll
 */
package payroll;

public class Calculation {

public static void main(String[] args) {
   Programmer pro;
AssistantProfessor Asspro;
AssociativeProfessor Asopro;
Professor prof;
pro=new Programmer("vijay",5025,"Chennai","vijaykumarkaranam@gmail.com",90000000,6000000);

Asspro=new AssistantProfessor("vinay",50130,"Chennai","vinay7@gmail.com",700000000,250000);

Asopro=new AssociativeProfessor("sai",800001,"Chennai","sai10@gmail.com",4000000,560000);

prof=new Professor("vishak",900001,"chennai","vishak7@gmail.com",2000000,580000);
pro.printStatement();
Asspro.printStatement();
Asopro.printStatement();
prof.printStatement();
}

}